package com.actitime.projectandcustomer;

public class subclass extends Overriding {
	
	public void dis(){
		
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overriding obj = new subclass();
obj.abc();;
	}

}
