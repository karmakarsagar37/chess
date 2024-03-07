package com.nymble.chess.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
/**
 * Represents a single cell on the chess board, possibly holding a Warrior.
 */
public class Cell {
    private int x;
    private int y;
    private Warrior currentWarrior = null;

    // Constructor with validation for x and y
    public Cell(int x, int y) {
        setX(x);
        setY(y);
    }

    // Method to check if the cell is empty
    public boolean isEmpty() {
        return this.currentWarrior == null;
    }

    // Method to make the cell empty
    public void setEmpty() {
        this.currentWarrior = null;
    }

    // Setter for x with validation
    public void setX(int x) {
        if (x >= 0 && x <= 7) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("x must be between 0 and 7 inclusive.");
        }
    }

    // Setter for y with validation
    public void setY(int y) {
        if (y >= 0 && y <= 7) {
            this.y = y;
        } else {
            throw new IllegalArgumentException("y must be between 0 and 7 inclusive.");
        }
    }
}
