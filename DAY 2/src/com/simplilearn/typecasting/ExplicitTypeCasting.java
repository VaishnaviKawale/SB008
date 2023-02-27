package com.simplilearn.typecasting;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1=123456789;    //8byte
		byte b1=(byte)d1;     //1 byte
		System.out.println("double (8byte) -> byte (1byte) : "+b1);      // randomly it comes 21 
		
		short s1=(short)d1;    //1 byte
		System.out.println("double (8byte) -> short (2byte) : "+b1);     //21
		
		float f1=(float)d1;
		System.out.println("double (8byte) -> float (2byte) : "+f1);     //1.23456792E8
		
		
		//the answer is not depend on compiler it will come any no./any letter randomly which is not defined
		
		

	}

}
