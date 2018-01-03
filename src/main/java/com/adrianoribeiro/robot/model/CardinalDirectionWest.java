package com.adrianoribeiro.robot.model;

/**
 * CardinalDirectionWest.java. 
 * @author  Adriano Ribeiro
 * @version 1.0 
 */
public class CardinalDirectionWest implements CardinalDirection {

	@Override
	public EnumCardinalDirection getOrientacaoValue() {
		return EnumCardinalDirection.WEST;
	}

	@Override
	public CardinalDirection right() {
		return new CardinalDirectionNorth();
	}

	@Override
	public CardinalDirection left() {
		return new CardinalDirectionSouth();
	}

}
