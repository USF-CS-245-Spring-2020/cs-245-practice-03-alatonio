/*
	LinearSearch.java
	Data Structures and Algorithms
	Author: Aileen L. Cai
	Due: February 13, 2020
*/



public class LinearSearch implements Practice03Search
{
	public int search(int [] a, int value)  //searching for the value in the array one at a time
	{
		for (int i = 0; i < a.length; i++)
			if (a[i] == value)
				return i;

		return -1; //if value is not present in array
	}
}
