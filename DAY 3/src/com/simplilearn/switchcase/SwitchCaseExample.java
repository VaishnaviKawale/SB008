package com.simplilearn.switchcase;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	case-1
		int x=10;
		switch(x){
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		}
		// 10
		//20
		//30
		// answer 10 is correct then why 20 and 30 are getting printed
		// it will explain in below
		
		//case-2
		int a=20;
		switch (a) {
		case 20 :
			System.out.println("20");      //20
			break ;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
		}
		
		//now here is answer coming is only 20 because we giving here break so with the help of break , 
		//if here we do the break then only correct output is getting printed
		
		//case-3
		int b=300;
		switch(b) {
		case 20 :
			System.out.println("20");
			break ;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
			break ;
				default:
					System.out.println("Default");   // Default
			
		}         // if above all the statements are wrong then Default will printed
		
		//case-4
		int c=300;
		switch (c) {
		case 20:
			System.out.println("20");
			break;
		case 300:
			System.out.println("300");    //300
			break;
		case 40:
			System.out.println("40");
			break;
		default:
			System.out.println("Default");
		}
		//here the correct output is 300 and the 300 is printed , now why here default is not printed 
		//because  default will printed when all the switch cases are false 
		
		//case-5
		String name ="john";
		switch (name) {
		case "john":
			System.out.println(" I am john");
			break;
		case "cena":
			System.out.println(" I am cena");
			break;
		case "robby":
		System.out.println("I am robby");
		break;
		case "sana":
			System.out.println("i am sana");
			break;
			default:
				System.out.println("Default");
		}
		//here we using string as int 
		//the method is same as int 
		// here we also use byte, short , int, char, enum, and string .
		
	}
}
			
			
			



