/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author lucas
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ChessMatch chessMatch = new ChessMatch();
            UI.printBoard(chessMatch.getPieces());
    }
    
}
