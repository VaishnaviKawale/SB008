package com.simplilearn.typecasting;

public class ImplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b1=123;
		short s1=b1;   //i am putting byte into short means 1 byte into 2 byte memory class
		System.out.println("byte -> short : "+s1);     //byte -> short : 123
		
		int i1=b1;
		System.out.println("byte -> int : "+i1);      //byte -> int : 123
		
		long l1=b1;
		System.out.println("byte -> long : "+l1);    // byte -> long : 123
		
		float f1=b1;
		System.out.println("byte -> float : "+f1);    // byte -> float : 123.0
		
		double d1=b1;
		System.out.println("byte -> double : "+d1);    // bytw -> double : 123.0
		
		
		//that means no data loss in the memory 

	}

}
