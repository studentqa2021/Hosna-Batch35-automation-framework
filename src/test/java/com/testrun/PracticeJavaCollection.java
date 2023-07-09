package com.testrun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeJavaCollection	{
public static void main(String[] args) {
	

//Java class depends of object


List<Integer> myList = new ArrayList<>();
//how to add value in list
myList.add(2);
myList.add(6);
myList.add(9);
//how to print a list
System.out.println( myList);
//how to add array in list addAll method only allow collection
Integer [] a = {2,3,4,5,6};
myList.addAll(Arrays.asList(a));
//print again
System.out.println("MyList="+myList);
//how to count value from list
System.out.println(myList.size());
//how to get value based on index =3
System.out.println(myList.get(3));
int maxValue =Collections.max(myList);
System.out.println(maxValue);
//how to find min value =Array

	//how to find min value = collection class
	//1==> Array to list
	//Arrays.asList(myArray);
	
	int minValue =Collections.min(myList);
	System.out.println(minValue);
	//sort
	Collections.sort(myList);
	System.out.println(myList);
	//reverse an array 1st sort=ace then == reverse = descending
	Collections.reverse(myList);
	System.out.println(myList);
	//remove duplicate
	
	Set<Integer> mySet =new HashSet<>();
	mySet.addAll(myList);
	System.out.println("set will remove the duplicate"+mySet);
	//11,22,33,44,55
	//create an ArrayList
	List<Integer>myList1 = new ArrayList<>();
	List<Integer>myList2 =new ArrayList<>();
	myList.add(11);
	myList.add(22);
	myList.add(33);
	myList.add(44);
	myList.add(55);
	myList.add(55);
	myList.add(55);
	myList.add(55);
	myList.add(null);
	myList.add(null);
	//print a list
	System.out.println(myList);
	//how tom remove duplicate = set
	Set<Integer> mySet1 = new HashSet<>();
	myList.add(11);
	
	
	
	
	
}
}

