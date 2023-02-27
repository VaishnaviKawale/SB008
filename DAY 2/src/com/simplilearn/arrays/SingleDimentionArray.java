package com.simplilearn.arrays;

public class SingleDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int[] a1= {1,2,3,4,5,6,7,8,9};
		int a2[]= {1,2,3,4,5,6,7,8,9};
		int []a3= {1,2,3,4,5,6,7,8,9};
		
		//tjis is colection of roll no. stored in integer array
		
		int[]rollnum={101,102,103,104,105,106,107,108};
		System.out.println(rollnum [0]);    //101
		System.out.println(rollnum [7]);    //108
		//System.out.println(rollnum [8]);    //java.lang.ArrayIndexOutOfBoundsException
		System.out.println("SIZE : "+rollnum.length);    //8 
		

	}

}
