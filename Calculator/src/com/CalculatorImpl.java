package com;

public class CalculatorImpl implements Cal {
	@Override
	public String add(int a,int b) {
		return "Sum: "+(a+b);
	}
	@Override
	public String sub(int a,int b) {
		return "Diffrence: "+(a-b);
	}
	@Override
	public String mul(int a,int b) {
		return "product: "+(a*b);
	}
	@Override
	public String div(int a,int b) {
		if(b!=0) {
			return "Division: "+(a/b);
		}
		else {
			return "Denominator is zero";
		}
		
	}
	@Override
	public String displayErrorMessage() {
		return "Syntax Error";
	}
}
