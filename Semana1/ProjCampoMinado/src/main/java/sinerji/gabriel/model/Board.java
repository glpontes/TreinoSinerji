package sinerji.gabriel.model;

import sinerji.gabriel.exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {

    private int lines;
    private int columns;
    private int bombs;

    private final List<Field> fields = new ArrayList<>();

    public Board(int lines, int columns, int bombs) {
        this.lines = lines;
        this.columns = columns;
        this.bombs = bombs;
        
        createFields();
        toNextAssociate(); // associa os vizinhos, vê que é vizinho de quem
        sortBombs();
    }

    public void open(int line, int column) {
        if (isValidCoordinate(line,column) == true){
            try {
                fields.parallelStream()
                    .filter(f -> f.getLine() == line && f.getColumn() == column)
                    .findFirst()
                    .ifPresent(f -> f.open());
            } catch (ExplosionException e) {
                fields.forEach(f -> f.setOpen(true));
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Coordenadas fora do limite do tabuleiro.");
        }
    }

    public void switchMarker(int line, int column) {
        if (isValidCoordinate(line,column) == true) {
            fields.parallelStream()
                    .filter(f -> f.getLine() == line && f.getColumn() == column)
                    .findFirst()
                    .ifPresent(f -> f.switchMarker());
        } else {
            throw new IllegalArgumentException("Coordenadas fora do limite do tabuleiro.");
        }
    }

    private boolean isValidCoordinate(int line, int column) {
        if  (line >= 0 && line < lines && column >= 0 && column < columns){
            return true;
        } else{
            return false;
        }
    }

    private void createFields() {
        for (int line = 0; line < lines; line++) {
            for (int column = 0; column < columns; column++) {
                fields.add(new Field(line, column));
            }
        }
    }

    private void toNextAssociate() {
        for (Field f1 : fields){
            for (Field f2 : fields){
                f1.addToNext(f2);
            }
        }
    }

    private void sortBombs() {
        Random random = new Random();
        int bombsPlaced = 0;

        while (bombsPlaced < bombs){
            int randomIndex = random.nextInt(fields.size());
            Field field = fields.get(randomIndex);

            //Testando se há bomba setada no local
            if (!field.isBomb()){
                field.setBomb();
                bombsPlaced++;
            }
        }

    }

    public boolean goalAchivied(){
        return fields.stream().allMatch(f -> f.goalAchivied());
    }

    public void restart(){
        fields.stream().forEach(f -> f.restart());
        sortBombs();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("  ");
        for (int column = 0; column < columns; column++){
            sb.append(" ");
            sb.append(column);
            sb.append(" ");
        }
        sb.append("\n");

        int i = 0;
        for (int line = 0; line < lines; line++) {
            sb.append(line);
            sb.append(" ");
            for (int column = 0; column < columns; column++) {
                sb.append(" ");
                sb.append(fields.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
