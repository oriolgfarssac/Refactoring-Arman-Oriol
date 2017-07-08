package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.chess.Position;

public class Move {
    public static boolean isDiagonalMove(Position from, Position to) {
        return Math.abs(from.getRow() - to.getRow()) == Math.abs(from.getColumn() - to.getColumn());
    }

    public  static boolean isHorizontalOrVerticalMove(Position from, Position to) {
        return from.getRow() == to.getRow() || from.getColumn() == to.getColumn();
    }
}