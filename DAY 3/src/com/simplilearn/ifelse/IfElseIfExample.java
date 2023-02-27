package com.simplilearn.ifelse;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 1
		int a=20;
		 if (a<20) {    //false
			 System.out.println("a is less than 20");
		 } else if (a==20) {
			 System.out.println("a is equal to 20");     // a is equal to 20
		 }else {
			 System.out.println("a is greater than 20");
		 }
		 
		 //case 2
		 int b=20;
		 if (b<30) {       //false
			 System.out.println("b is less than 30");    // b is less than 30
		 } else if (b ==20) {       // true
			 System.out.println("b is equal to 20");
		 } else {
			 System.out.println("b is greater than 20");
			 
		 }
		 
		 // case 3
		 int c=200;
		 if (c<30) {   //false
			 System.out.println("c is less than 30");
		 } else if (c==20) {      //false
			 System.out.println("c is equal to 20");
		 } else {
			 System.out.println("c is neither less than 30 nor equal to 20");   // this statement is correct
		 }

	}      // if in those conditions the two or three conditions  are correct then the first statement
	// which comes first is adopted 

}
