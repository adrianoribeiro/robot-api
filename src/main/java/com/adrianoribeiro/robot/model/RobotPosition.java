package com.adrianoribeiro.robot.model;

import java.util.List;

import com.adrianoribeiro.robot.command.Command;
import com.adrianoribeiro.robot.command.CommandListFactory;
import com.adrianoribeiro.robot.dto.RobotDto;
import com.adrianoribeiro.robot.exception.InvalidPositionException;

/**  
* RobotPosition.java - RobotPosition control the Robot instance  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class RobotPosition {

	private Robot robot;
	private int x;
	private int y;
	private int limitX;
	private int limitY;
	private CardinalDirection cardinalDirection;
	
	/**
	 * Constructor
	 * @param limitX
	 * @param limitY
	 */
	public RobotPosition(final int limitX, final int limitY){
		this.robot = new Robot();
		this.setX(0);
		this.setY(0);
		this.setLimitX(limitX);
		this.setLimitY(limitY);
		this.cardinalDirection = new CardinalDirectionNorth();
	}
	
   /**  
    * The robot rotate on its own axis 90 degrees to the right
    */  	
	public void rotateRight() {
		rotacionar(EnumRotacionar.RIGHT);		
	}

   /**  
    * The robot rotate on its own axis 90 degrees to the left
    */  	
	public void rotateLeft() {
		rotacionar(EnumRotacionar.LEFT);		
	}
	
   /**  
    * Run commands.
    * @param A command used into robot  
    * @return A RobotDto object and its last position.  
    */  
	public RobotPosition runCommands(String commands) {

		final List<Command> listCommand = CommandListFactory.getListCommand(this, commands);
		
		for (Command command : listCommand) {
			command.execute();
		}

		return this;
	}

   /**  
    * Move the robot.
    */  
	public void moveRobot() {
		switch (cardinalDirection.getOrientacaoValue()) {
		case NORTH:
			incrementY();
			break;
		case SOUTH:
			decrementY();
			break;
		case WEST:
			decrementX();
			break;
		case EAST:
			incrementX();
			break;
		default:
			break;
		}
	}

   /**  
    * Apply the rotation.
    * @param Indicates if must to rotate right or left
    */  
	public void rotacionar(EnumRotacionar rotacionar){
		this.cardinalDirection = cardinalDirection.apply(rotacionar);
	}

   /**  
    * Return a structured object to output.
    * @return A RobotDto object.  
    */  
	public RobotDto toDto() {
		
		return new RobotDto(this);
	}
	
	//Private methods
	private void incrementX() {
		validatePosition(++this.x);
	}

	private void decrementX() {
		validatePosition(--this.x);
	}

	private void decrementY() {
		validatePosition(--this.y);
	}

	private void incrementY() {
		validatePosition(++this.y);
	}

	private void validatePosition(int position) {
		if(position < 0 || this.getX() > (getLimitX()-1) || this.getY() > (getLimitY()-1)){
			throw new InvalidPositionException();
		}
	}
	
	//Gets and sets
	public int getLimitX() {
		return limitX;
	}

	public void setLimitX(int limitX) {
		this.limitX = limitX;
	}

	public int getLimitY() {
		return limitY;
	}

	public void setLimitY(int limitY) {
		this.limitY = limitY;
	}

	public Robot getRobot() {
		return robot;
	}

	public void setRobot(Robot robot) {
		this.robot = robot;
	}

	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public CardinalDirection getCardinalDirection() {
		return cardinalDirection;
	}

	public void setCardinalDirection(CardinalDirection cardinalDirection) {
		this.cardinalDirection = cardinalDirection;
	}

	public EnumCardinalDirection getOrientacaoValue() {
		return getCardinalDirection().getOrientacaoValue();
	}
}
