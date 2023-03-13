package com.membemodifier;

public class PrivateAccessModifier {

	private int abc=100;
	
	public static void main(String[] args) {
		
		PrivateAccessModifier instance=new PrivateAccessModifier();
		System.out.println(instance.abc);
		instance.display();

	}
	
	private void display() {
		System.out.println("Hello Ninja");
	}

}
