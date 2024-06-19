package sinerji.gabriel.vision;

import sinerji.gabriel.exception.ExitException;
import sinerji.gabriel.exception.ExplosionException;
import sinerji.gabriel.exception.InvalidValueException;
import sinerji.gabriel.model.Board;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BoardConsole {

    private Board board;
    private Scanner sc = new Scanner(System.in);

    public BoardConsole(Board board) {
        this.board = board;

        executeGame();
    }

    private void executeGame() {
        try{
           boolean continuar = true;
           while(continuar){
               try {
                   gameLoop();
               }catch(InvalidValueException e) {
                   System.out.println(e.getMessage());
               }
                System.out.println("Quer iniciar outra? (S/N)");
                String answer = sc.nextLine().trim();

                if("n".equalsIgnoreCase(answer)){
                    continuar = false;
                } else if(!"s".equalsIgnoreCase(answer)) {
                    throw new InvalidValueException();
                }
            }
        } catch (ExitException e){
            System.out.println("Tchau");
        } finally {
            sc.close();
        }
    }

    private void gameLoop() {
        try {
            while(!board.goalAchivied()){
                System.out.println(board);

                String typed = captureDigitedValue("Digite a linha e a coluna: " +
                        "\n ou 'sair' para sair do jogo");

                Iterator<Integer> xy = Arrays.stream(typed.split(","))
                        .map(e -> Integer.parseInt(e.trim())).iterator();

                typed = captureDigitedValue(" 1 - abrir ou 2 - (Des)Marcar");
                if ("1".equals(typed)){
                    board.open(xy.next(), xy.next());
                } else if ("2".equals(typed)){
                    board.switchMarker(xy.next(), xy.next());
                } else{
                    throw new InvalidValueException();
                }

            }
            System.out.println("Você ganhou!");
        } catch (ExplosionException e){
            System.out.println(board);
            System.out.println("Você perdeu! :(");
        }
    }

    private String captureDigitedValue(String text){
        System.out.println(text);
        String typed = sc.nextLine();

        if ("sair".equalsIgnoreCase(typed)) {
            throw new ExitException();
        }
        return typed;
    }
}
