package com.nymble.chess.models;

import java.util.List;

/**
 *
 *  Represents the King piece in the game of chess.
 *   Similar logic to be written for Queen, Knight, Pawns, etc
 */
public class King extends Warrior{
    private final List<Rule> rules = List.of(
            new Rule(1, -1),
            new Rule(1, 0),
            new Rule(1, 1),
            new Rule(0,1),
            new Rule(0,1),
            new Rule(-1,1),
            new Rule(-1,0),
            new Rule(-1,-1),
            new Rule(0,-1));

    public King(boolean isBlack, boolean isKilled) {
        super(isBlack, isKilled);
    }

    @Override
    public boolean isValidMove(Board board, Cell initialPosition, Cell finalPosition) {
        int moveInX = finalPosition.getX() - initialPosition.getX();
        int moveInY = finalPosition.getY() - initialPosition.getY();
        if(!finalPosition.isEmpty()){
            return false;
        }
        // Iterate through each rule in the rules list
        for (Rule rule : rules) {
            // Check if there is a rule matching the moveInX and moveInY
            if (rule.getMoveInXAxis() == moveInX && rule.getMoveInYAxis() == moveInY) {
                return true; // The move is valid according to the rules for the King
            }
        }
        return false;
    }
}
