/*
	BinaryRecursiveSearch.java
	Data Structures and Algorithms
	Author: Aileen L. Cai
	Due: February 13, 2020
*/


import java.util.Arrays;

public class BinaryRecursiveSearch implements Practice03Search
{
	public int search(int [] a, int value) {
		return search(a, value, 0, a.length - 1);  //helper function 
	}

	private int search(int [] a, int value, int minimum, int maximum)
	{
		if (minimum >= maximum)  //if minimum and maximum cross, value isn't present in array
			return -1;
 
		int middle = (minimum + maximum) / 2;   //looking for the number in the middle of sorted array to compare against value

		if (a[middle] == value) //location of our value already found
			return middle; 

		else if (a[middle] < value)  
		{	
			return search(a, value, middle + 1, maximum);  //modifying the minimum because all values before a[middle] are less than value; no need to search those
		}

		else
		{
			return search(a, value, minimum, middle - 1);	//modifying the maximum because all values after a[middle] are greater than value; no need to search those
		}
	}
}

