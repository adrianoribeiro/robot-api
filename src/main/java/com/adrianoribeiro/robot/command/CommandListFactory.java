package com.adrianoribeiro.robot.command;

import java.util.ArrayList;
import java.util.List;

import com.adrianoribeiro.robot.exception.InvalidCommandException;
import com.adrianoribeiro.robot.model.RobotPosition;

/**  
* CommandListFactory.java - Command list factory class.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class CommandListFactory {

	private CommandListFactory(){}
	
   /**  
    * Generates a list of commands from a text.
    * @param A RobotPosition object
    * @param A command string
    * @return A List of commands.  
    */ 
	public static List<Command> getListCommand(final RobotPosition robotPosition, final String commands){
		
		final List<Command> listCommand = new ArrayList<>();
		
		for (int i = 0; i < commands.length(); i++) {
			
			char valueCurrent = commands.charAt(i);
			
			switch (valueCurrent) {
			case 'M':
				listCommand.add(new CommandMove(robotPosition));
				break;
			case 'L':
				listCommand.add(new CommandRotateLeft(robotPosition));
				break;
			case 'R':
				listCommand.add(new CommandRotateRight(robotPosition));
				break;
			default:
				throw new InvalidCommandException();
			}
		}
		
		return listCommand;
	}
	
}
