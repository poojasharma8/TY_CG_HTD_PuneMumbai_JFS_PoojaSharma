package com.capgemini.springcore.annotations.beans;

import com.capgemini.interfaces.Engine;

public class Isuzu implements Engine {

	@Override
	public double getCC() {
		return 1500;
	}

	@Override
	public String getType() {
		return "4-Stroke Petrol";
	}

}
