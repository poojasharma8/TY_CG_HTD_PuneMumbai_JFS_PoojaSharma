package com.capgemini.objectClass;

public class Cow {

	int id;
	String name;
	
	
	
	public boolean equals(Object ref) { 
		Cow r = (Cow) ref;
		if (this.id == r.id) {
			if(this.name.equals(r.name)) {
				return true;
			}
			else {
				return false;
				}
			}
		
			else {
				return false;
		}
	}
}
	
