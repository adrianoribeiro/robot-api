package com.adrianoribeiro.robot.model;

/**  
* CardinalDirection.java - Interface.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public interface CardinalDirection {
	public EnumCardinalDirection getOrientacaoValue();
	
	public CardinalDirection right();
	public CardinalDirection left();
	
	public default CardinalDirection apply(EnumRotacionar rotacionar){
		return (rotacionar == EnumRotacionar.LEFT)? left(): right();
	}
}
