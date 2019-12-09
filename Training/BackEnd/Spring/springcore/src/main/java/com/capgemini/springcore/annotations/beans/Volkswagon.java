package com.capgemini.springcore.annotations.beans;

import com.capgemini.interfaces.Engine;

public class Volkswagon implements Engine {

	@Override
	public double getCC() {
		return 1700;
	}

	@Override
	public String getType() {
		return "4-Stroke Diesel";
	}

}
