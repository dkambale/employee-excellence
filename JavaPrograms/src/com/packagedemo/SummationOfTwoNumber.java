package com.packagedemo;

public class SummationOfTwoNumber {
	
	public int referenceVariable=100;

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		
		SummationOfTwoNumber instance=new SummationOfTwoNumber();
		int finalSumm=instance.sum(a, b);
		
		System.out.println(finalSumm);
		
		DefaultClass instance2=new DefaultClass();

	}

	 public int sum(int number1,int number2) {
		
		int sum=number1+number2;
		
		return sum;
		
	}
}
