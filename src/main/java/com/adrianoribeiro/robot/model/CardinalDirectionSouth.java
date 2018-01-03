package com.adrianoribeiro.robot.model;

/**
 * CardinalDirectionSouth.java. 
 * @author  Adriano Ribeiro
 * @version 1.0 
 */
public class CardinalDirectionSouth implements CardinalDirection {

	@Override
	public EnumCardinalDirection getOrientacaoValue() {
		return EnumCardinalDirection.SOUTH;
	}

	@Override
	public CardinalDirection right() {
		return new CardinalDirectionWest();
	}

	@Override
	public CardinalDirection left() {
		return new CardinalDirectionEast();
	}

}
