package com.simplilearn.dowhileloop;

public class DoWhileExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		do {
			System.out.println("a is less than b");
			a++;
		} while (a<b);
 
		// here is printed 'a is less than b' until its satisfied
		//like the program will run as in a++ is 
		// a is 11(11<20), a is 12(12<20), a is 13.....upto 20 then 20<20(its false )
		//then the program will stop running
	}

}
