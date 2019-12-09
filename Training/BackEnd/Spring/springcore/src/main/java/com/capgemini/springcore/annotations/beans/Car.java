package com.capgemini.springcore.annotations.beans;

import com.capgemini.interfaces.Engine;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private String modelName ;
	private int modelNo ;
	@Autowired
	private Engine engine ;
	
	//Getters & Setters
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
