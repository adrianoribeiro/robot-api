package com.adrianoribeiro.robot.model;

/**  
* CardinalDirectionEast.java.  
* @author  Adriano Ribeiro
* @version 1.0 
*/ 
public class CardinalDirectionEast implements CardinalDirection {

	@Override
	public EnumCardinalDirection getOrientacaoValue() {
		return EnumCardinalDirection.EAST;
	}

	@Override
	public CardinalDirection right() {
		return new CardinalDirectionSouth();
	}

	@Override
	public CardinalDirection left() {
		return new CardinalDirectionNorth();
	}

}
