package com.nymble.chess.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Warrior {
//    Denotes the warrior is black player or white
    protected boolean isBlack;
//    Denotes whether it is killed or alive in the Game
    protected boolean isKilled;

    // Constructor to initialize a Warrior
    public Warrior(boolean isBlack) {
        this.isBlack = isBlack;
        this.isKilled = false;
    }

    // Abstract method to be implemented by subclasses like King, Queen, Knight, etc
    public abstract boolean isValidMove(Board board, Cell initialPosition, Cell finalPosition);

    // Method to mark a warrior as killed
    public void kill() {
        this.isKilled = true;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isKilled() {
        return isKilled;
    }
}

