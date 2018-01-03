package com.adrianoribeiro.robot.dto;

import com.adrianoribeiro.robot.model.RobotPosition;

/**  
* RobotDto.java.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class RobotDto {

	private int x;
	private int y;
	private char orientation;
	
	/**
	 * Constructor.
	 * @param RobotPosition
	 */
	public RobotDto(RobotPosition robotPosition) {
		this.x = robotPosition.getX();
		this.y = robotPosition.getY();
		this.orientation = robotPosition.getOrientacaoValue().asChar();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public char getOrientation() {
		return orientation;
	}
}
