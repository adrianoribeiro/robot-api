package com.adrianoribeiro.robot.model;

/**  
* EnumCardinalDirection.java - Cardinal direction enum.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public enum EnumCardinalDirection {
	NORTH('N'), WEST('W'), EAST('E'), SOUTH('S');
	
    public char asChar() {
        return asChar;
    }

    private final char asChar;

    private EnumCardinalDirection(char asChar) {
        this.asChar = asChar;
    }

}
