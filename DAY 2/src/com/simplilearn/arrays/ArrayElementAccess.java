package com.simplilearn.arrays;

public class ArrayElementAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] myIntArray= {100,200,45,29,49,89,76,85};
		System.out.println("Index at 0 - "+myIntArray[0]);
		System.out.println("Index at 1 - "+myIntArray[1]);
	System.out.println("Index at 2 - "+myIntArray[2]);
	System.out.println("Index at 3 - "+myIntArray[3]);
	System.out.println("Index at 4 - "+myIntArray[4]);
	System.out.println("Index at 5 - "+myIntArray[5]);
	System.out.println("Index at 6 - "+myIntArray[6]);
	System.out.println("Index at 7 - "+myIntArray[7]);

	
//now here we find index no. one by one because the elements are countable but what if the elements
//are not countable easily then there is another method to solve it by easily and it is following down
	
	//there are more elements are given
	
	int[] myIntArray1= {123,43,56,42,67,95,86,46,97,39,81,62,55,88,57,82,66};
	System.out.println("SIZE -: "+myIntArray1.length);    // size is 17 is shown
	//direct we calculate the no. of elements are given in the array
	//but now we have to calculate the no. of index value given in the array
	//for that there is another method to directly shown all the elements at a time ,not one by one.
	
	/*
	 * i= this is index of an Array
	 * */
	
	for(int i =0; i< myIntArray1.length; i++){
	
	System.out.println("Index At "+ i + " : "+myIntArray1[i]);
	//index at 0- 100
	//Index at 1-200
	//index at (upto 16 ) will printed
	
	}
	}
}
	