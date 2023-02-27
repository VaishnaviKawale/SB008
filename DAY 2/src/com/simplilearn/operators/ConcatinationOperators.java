package com.simplilearn.operators;

public class ConcatinationOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String firstname="Vaishnavi";
		String lastname="Kawale";
		
		System.out.println("First Name : "+firstname);   //Vaishnavi
		System.out.println("Last Name : "+lastname);     //Kawale
		
		String name=firstname+" "+lastname;
		//I m concatinating shes first name and last name having space in between
		// hence + is also call concatination operator
		System.out.println("Name : "+name);    //Vaishnavi Kawale
		
		int a=10;
		int b=20;
		System.out.println(a+b);   //30
		//In int + is act as plus 
		
		String a1="10";
		String b1="20";
		System.out.println(a1+b1);      //1020
		//In String + is act as concatination 

	}

}
