package com.adrianoribeiro.robot.model;
/**
 * 
 * CardinalDirectionNorth.java. 
 * @author  Adriano Ribeiro
 * @version 1.0 
 */
public class CardinalDirectionNorth implements CardinalDirection {

	@Override
	public EnumCardinalDirection getOrientacaoValue() {
		return EnumCardinalDirection.NORTH;
	}

	@Override
	public CardinalDirection right() {
		return new CardinalDirectionEast();
	}

	@Override
	public CardinalDirection left() {
		return new CardinalDirectionWest();
	}
}
