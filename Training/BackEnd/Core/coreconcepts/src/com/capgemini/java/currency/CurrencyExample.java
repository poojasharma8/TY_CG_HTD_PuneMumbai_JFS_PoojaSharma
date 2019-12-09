package com.capgemini.java.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExample {

	public static void main(String[] args) {
		Currency currencyCode1 =Currency.getInstance("INR");
		Currency currencyCode2 =Currency.getInstance("USD");
		
		String currencyCode1Symbol = currencyCode1.getSymbol();
		String currencyCode2Symbol = currencyCode2.getSymbol();
		
		System.out.println("Symbol for INR :"+currencyCode1Symbol);
		System.out.println("Symbol for USD :"+currencyCode2Symbol);
		System.out.println("*****************************");
		
		String currencyCode1DisplayName = currencyCode1.getDisplayName();
		String currencyCode2DisplayName = currencyCode2.getDisplayName();

		System.out.println("Display Name for INR IS :"+currencyCode1DisplayName);
		System.out.println("Display Name for USD IS :"+currencyCode2DisplayName);
		System.out.println("******************************");
		
		
		Set<Currency> currencies = Currency.getAvailableCurrencies();
		System.out.println(currencies);
		System.out.println("******************************");
		
		int currencyCode1defaultFraction = currencyCode1.getDefaultFractionDigits();
		int currencyCode2defaultFraction = currencyCode2.getDefaultFractionDigits();
	
		System.out.println("Default Fracetion Digits for INR IS :"+currencyCode1defaultFraction);
		System.out.println("Default Fraction Digits for USD IS :"+currencyCode2defaultFraction);
		System.out.println("******************************");
	
	
	}

}
