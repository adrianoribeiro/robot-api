package com.adrianoribeiro.robot.command;

import com.adrianoribeiro.robot.model.RobotPosition;

/**  
* CommandMove.java - Command that move the robot.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class CommandMove implements Command {

	private RobotPosition robotPosition; 
	
	/**
	 * Constructor.
	 * @param robotPosition
	 */
	public CommandMove(RobotPosition robotPosition) {
		this.robotPosition = robotPosition;
	}

	@Override
	public void execute() {
		robotPosition.moveRobot();
	}
}
