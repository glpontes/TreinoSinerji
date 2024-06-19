package sinerji.gabriel;

import sinerji.gabriel.model.Board;
import sinerji.gabriel.vision.BoardConsole;

public class Application {

    public static void main(String[] args) {

        Board board = new Board(6,6,6);

        new BoardConsole(board);
    }
}
