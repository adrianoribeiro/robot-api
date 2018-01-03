package com.adrianoribeiro.robot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adrianoribeiro.robot.dto.RobotDto;
import com.adrianoribeiro.robot.service.RobotService;


/**  
* RobotController.java - Robot controller.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
@RestController
@RequestMapping("/rest/mars")
public class RobotController {

	@Autowired
	private RobotService service;
	
   /**  
    * Move and retrieve the robot.
    * @param A command used into robot  
    * @return A RobotDto object and its last position.  
    */  
	@PostMapping("/{commands}")
	public RobotDto move(@PathVariable final String commands){
		return service.move(commands);
	}
}
