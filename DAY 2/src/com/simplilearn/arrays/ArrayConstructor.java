package com.simplilearn.arrays;

public class ArrayConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Every array in JAVA is an object
		//this is integer Array of size 5 having no element 
		int[]a=new int[5];
		
		//THis is integer Array of size having 1,2,3,4,5 as a element
        int[]b= {1,2,3,4,5};
        //both the int array are same in meaning 
		
		System.out.println("Length of Array a - "+a.length);    //5
		System.out.println("Length of Array b - "+b.length);    //5
		
		//When inserting the data in the array  index
		a[0]=9;
		a[1]=10;
		a[2]=11;
		a[3]=12;
		a[4]=13;
		
		//if we inserting the data in the array then length of the  array is as it is
		//because its already decided
				

	}

}
