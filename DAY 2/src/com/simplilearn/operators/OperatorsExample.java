package com.simplilearn.operators;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=++a; //pre-increment
		System.out.println("value of b : "+b);    //value of b : 11
		
		int c=a++; //post increment
		System.out.println("value of c : "+c);    //value of c : 11
		
		//int d= c++
		int d=++c;
		System.out.println("value of d : "+d);    //value of d : 12

	}

}
