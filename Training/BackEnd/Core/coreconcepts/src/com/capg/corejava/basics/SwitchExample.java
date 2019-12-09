package com.capg.corejava.basics;

public class SwitchExample {


	public static void main(String[] args)
	{
		int dayNum = 10;
		switch(dayNum)
		{
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("tuesday");
		break;
		case 3: System.out.println("wednesday");
		break;
		case 4: System.out.println("thursday");
		break;
		case 5: System.out.println("friday");
		break;
		case 6: System.out.println("saturday");
		break;
		case 7: System.out.println("sunday");
		break;
		default : System.out.println("invalid day num");
		}
		switch(dayNum) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		System.out.println("weekdays");
		break;
		case 6:
		case 7:
		System.out.println("weekends");
		break;
		default : System.out.println("invalid day num");

		}

	}

}