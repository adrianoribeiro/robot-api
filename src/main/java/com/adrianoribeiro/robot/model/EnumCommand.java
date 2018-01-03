package com.adrianoribeiro.robot.model;

/**
 * EnumCommand.java. 
 * @author  Adriano Ribeiro
 * @version 1.0 
 */
public enum EnumCommand {

	LEFT('L'), RIGTH('R'), MOVE('M');
	
    public char asChar() {
        return asChar;
    }

    private final char asChar;

    private EnumCommand(char asChar) {
        this.asChar = asChar;
    }
	
}
