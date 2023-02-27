package com.simplilearn.ifelse;

public class IfelseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		if (x==10) {
			System.out.println("x is 10");
		} else {
			System.out.println("x is not 10");     //x is 10
		}
		
int a=20;
if (a==10) {
	System.out.println("a is 10");
}else {
	System.out.println("a is not 10");       // a is not 10
}
        int b=30;
        if (b<10) {
        	System.out.println("b is les than 10");
        } else {
        	System.out.println("b is greater than 10");      // b is greater than 10
        	
        }
        // in the condition only "if" condition is present then no problem the program will run 
        //without else condition
        
        if (false) {
         System.out.println(" I am going to school");
        }
        	
        if (false) {
        System.out.println("I am going to school");
        } else {
        System.out.println("No matter what circumstance I want to go to school");
        }
	}

}
