package com.adrianoribeiro.robot.service;

import org.springframework.stereotype.Service;

import com.adrianoribeiro.robot.dto.RobotDto;
import com.adrianoribeiro.robot.model.RobotPosition;

/**  
* RobotService.java - Robot service.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
@Service
public class RobotService {

   /**  
    * Move and retrieve the robot.
    * @param A command used into robot  
    * @return A RobotDto object and its last position.  
    */  
	public RobotDto move(final String commands) {
		final RobotPosition robotPosition = (new RobotPosition(5, 5)).runCommands(commands);
		
		return robotPosition.toDto();
	}
}
