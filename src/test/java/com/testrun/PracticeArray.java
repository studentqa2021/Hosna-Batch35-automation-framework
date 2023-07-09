package com.testrun;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class PracticeArray {
	
public static void main(String[] args) {
	//2,3,4,5,6 how to declare the Array in the number /print only Array
		int [] myArray = {2,3,4,5,6};
		System.out.println(Arrays.toString(myArray));
		//how to find any array value based on index =0
		System.out.println(myArray[0]);
		//how to find any Array values count
		System.out.println(Array.getLength(myArray));
		//how to convert Array to a  list
		System.out.println(Arrays.asList(myArray));
		//how to find max value =Array
		int max =Arrays.stream(myArray).max().getAsInt();
		System.out.println(max);
		//how to find mix value = collection class
		//1==> Array to list
		//Arrays.asList(myArray);
		Integer [] a = {2,3,4,5,6};
		int maxValue =Collections.max(Arrays.asList(a));
		System.out.println(maxValue);
		//how to find min value =Array
				int min =Arrays.stream(myArray).max().getAsInt();
				System.out.println(max);
				//how to find min value = collection class
				//1==> Array to list
				//Arrays.asList(myArray);
				
				int minValue =Collections.min(Arrays.asList(a));
				System.out.println(minValue);
				//sort
				Collections.sort(Arrays.asList(a));
				System.out.println(Arrays.toString(a));
				//reverse an array 1st sort=ace then == reverse = descending
				Collections.reverse(Arrays.asList(a));
				System.out.println(Arrays.toString(a));
				
	} 
	
}	
	
	
	
	
	

