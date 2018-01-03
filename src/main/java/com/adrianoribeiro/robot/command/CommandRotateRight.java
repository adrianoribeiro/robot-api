package com.adrianoribeiro.robot.command;

import com.adrianoribeiro.robot.model.RobotPosition;

/**  
* CommandRotateRight.java - Command that rotate the robot to right.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class CommandRotateRight implements Command {

	private RobotPosition robotPosition; 

	/**
	 * Constructor.
	 * @param robotPosition
	 */
	public CommandRotateRight(RobotPosition robotPosition) {
		this.robotPosition = robotPosition;
	}

	@Override
	public void execute() {
		robotPosition.rotateRight();
	}
}
