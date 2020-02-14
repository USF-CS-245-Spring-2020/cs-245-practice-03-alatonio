/*
	BinaryIterativeSearch.java
	Data Structures and Algorithms
	Author: Aileen L. Cai
	Due: February 13, 2020
*/



public class BinaryIterativeSearch implements Practice03Search
{
	public int search(int [] a, int value)
	{
		int minimum = 0;        
		int maximum = a.length-1;   //has to be 1 less than length of array to avoid out of bounds error

		while(minimum <= maximum)
		{
			int middle = (minimum + maximum)/2;   //splitting the array in half 

			if (a[middle] == value)  //if the middle matches value we're looking for, return index 
				return middle;

			if (a[middle] < value) 
				return minimum = middle+1; //gets rid of lower half of array because they're all less than what we're looking for
			
			else 
				maximum = middle-1;  //gets rid of upper half of array because all values are bigger than what we're looking for
		}

		return -1;  //if value does not exist in array
	}
}