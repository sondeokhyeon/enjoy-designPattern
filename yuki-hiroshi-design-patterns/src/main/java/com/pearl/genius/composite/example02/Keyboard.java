package com.pearl.genius.composite.example02;

/**
 * Created by Administrator on 2015-07-23.
 */
public class Keyboard extends ComputerDevice {

	private int price;
	private int power;

	public Keyboard(int power, int price) {
		this.price = price;
		this.power = power;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getPower() {
		return power;
	}
}
