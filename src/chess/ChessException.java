/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.BoardException;

/**
 *
 * @author lucas
 */
public class ChessException extends BoardException {
    private static final long serialVersionUIID = 1L;
    
    public ChessException(String msg) {
        super(msg);
    }
}
