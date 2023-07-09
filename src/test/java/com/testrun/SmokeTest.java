package com.testrun;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmokeTest {
	
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
	
}
}
