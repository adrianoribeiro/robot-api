package com.adrianoribeiro.robot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.adrianoribeiro.robot.exception.InvalidCommandException;
import com.adrianoribeiro.robot.exception.InvalidPositionException;
import com.adrianoribeiro.robot.model.EnumCardinalDirection;
import com.adrianoribeiro.robot.model.RobotPosition;

public class MyTest {

	@Test
	public void CreateARobot(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		
		assertEquals(0, robotPosition.getX());
		assertEquals(0, robotPosition.getY());
		assertEquals(EnumCardinalDirection.NORTH, robotPosition.getOrientacaoValue());
	}	
	
	@Test
	public void MovimentoComRotacoesParaDireita(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		RobotPosition robotNewPosition = robotPosition.runCommands("MMRMMRMM");
		
		assertEquals(2, robotNewPosition.getX());
		assertEquals(0, robotNewPosition.getY());
		assertEquals(EnumCardinalDirection.SOUTH, robotNewPosition.getOrientacaoValue());
	}

	@Test
	public void MovimentoParaEsquerda(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		RobotPosition robotNewPosition = robotPosition.runCommands("MML");
		
		assertEquals(0, robotNewPosition.getX());
		assertEquals(2, robotNewPosition.getY());
		assertEquals(EnumCardinalDirection.WEST, robotNewPosition.getOrientacaoValue());
	}
	
	@Test(expected=InvalidCommandException.class)
	public void ComandoInvalido(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		robotPosition.runCommands("AAA");
	}
	
	@Test(expected=InvalidPositionException.class)
	public void PosicaoMenorQueZeroParaOEixoX(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		robotPosition.runCommands("LM");
	}
	
	@Test(expected=InvalidPositionException.class)
	public void PosicaoMenorQueZeroParaOEixoY(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		robotPosition.runCommands("LLM");
	}
	
	@Test(expected=InvalidPositionException.class)
	public void PosicaoMaiorQueLimiteParaOEixoY(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		robotPosition.runCommands("MMMMMMMMMMMMMMMMMMMMMMMM");
	}
	
	@Test(expected=InvalidPositionException.class)
	public void PosicaoMaiorQueLimiteParaOEixoX(){
		RobotPosition robotPosition = new RobotPosition(5, 5);
		robotPosition.runCommands("RMMMMMMMMMMMMMMMMMMMMMMMM");
	}
}
