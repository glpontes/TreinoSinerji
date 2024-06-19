package sinerji.gabriel.model;

import sinerji.gabriel.exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private final int line;
    private final int column;
    public boolean isMarked;

    private boolean bomb = false;
    private boolean open = false;
    private boolean marked = false;

    private List<Field> toNexts = new ArrayList<>();

    public Field(int arrow, int column) {
        this.line = arrow;
        this.column = column;
    }

    public boolean addToNext(Field toNext) {
        boolean  differentLine = line !=toNext.line;
        boolean differentColumn = column !=toNext.column;
        boolean diagonal = differentLine && differentColumn;

        int deltaLine = Math.abs(line - toNext.line);
        int deltaColumn = Math.abs(column - toNext.column);
        int deltaGeral = deltaLine + deltaColumn;

        if(deltaGeral == 1 && !diagonal){
            toNexts.add(toNext);
            return true;
        } else if(deltaGeral == 2 && !diagonal){
            toNexts.add(toNext);
            return true;
        } else{
            return false;
        }
    }

    public void switchMarker(){
        if(!open){
            marked = !marked;
        }
    }

    public boolean open(){
        if(!open && !marked){
            open = true;

            if(bomb){
                throw new ExplosionException();
            }
            if (toNextSafe()){
                toNexts.forEach(n -> n.open());
            }
            return true;
        } else {
            return false;
        }
    }

    boolean toNextSafe(){
        return toNexts.stream().noneMatch(n -> n.bomb);
    }

    public void setBomb(){
        bomb = true;
    }

    public boolean isBomb(){
        return bomb;
    }

    public boolean isMarked(){
        return marked;
    }



    void setOpen(boolean open){
        this.open = open;
    }

    public boolean isOpen(){
        return open;
    }

    public boolean isClosed(){
        return !isOpen();
    }

    public int getLine(){
        return line;
    }

    public int getColumn(){
        return column;
    }

    boolean goalAchivied(){
        boolean uncovered = !bomb && open;
        boolean secure = bomb && marked;
        return uncovered || secure;
    }

    long bombsOnSide(){
        return toNexts.stream().filter(n -> n.bomb).count();
    }

    void restart(){
        open = false;
        bomb = false;
        marked = false;
    }

    public String toString(){
        if(marked){
            return  "x";

        } else if (open && bomb) {
            return  "*";

        } else if (open && bombsOnSide() > 0){
            return Long.toString(bombsOnSide());
        } else if (open) {
            return " ";
        } else {
            return "?";
        }
    }
}
