package pecas;

import chess.ChessPiece;
import chess.Color;
import tabuleiro.Board;

public class Rei  extends ChessPiece{

    public Rei(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString(){
        return "R";
    }
    
}
