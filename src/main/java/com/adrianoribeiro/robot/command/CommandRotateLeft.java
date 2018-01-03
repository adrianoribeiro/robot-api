package com.adrianoribeiro.robot.command;

import com.adrianoribeiro.robot.model.RobotPosition;

/**  
* CommandRotateLeft.java - Command that rotate the robot to left.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class CommandRotateLeft implements Command {

	private RobotPosition robotPosition; 
	
	/**
	 * Constructor.
	 * @param robotPosition
	 */
	public CommandRotateLeft(RobotPosition robotPosition) {
		this.robotPosition = robotPosition;
	}

	@Override
	public void execute() {
		robotPosition.rotateLeft();
	}
}
