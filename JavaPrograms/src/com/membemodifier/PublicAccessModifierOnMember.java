package com.membemodifier;

import com.packagedemo.SummationOfTwoNumber;

public class PublicAccessModifierOnMember {

	public int x=10;
	
	public static void main(String[] args) {
		SummationOfTwoNumber instance =new SummationOfTwoNumber();
		System.out.println(instance.referenceVariable);
		int summation=instance.sum(10, 20);
		System.out.println(summation);
	}
	
	
	public void display () {
		System.out.println("hello");
	}
	


	//
}
