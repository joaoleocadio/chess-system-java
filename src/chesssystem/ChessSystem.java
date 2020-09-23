package chesssystem;

import boardGame.Board;
import boardGame.Position;
import chess.ChessMatch;

/**
 *
 * @author Utilizador
 */
public class ChessSystem {

    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
    
}
