package com.nymble.chess.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Defines a rule for movement, characterized by changes in X and Y coordinates.
 */
@Data
@AllArgsConstructor
public class Rule {
    int moveInXAxis;
    int moveInYAxis;
}
