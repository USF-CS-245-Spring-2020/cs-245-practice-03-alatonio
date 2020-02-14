/*
	SelectionSort.java
	Data Structures and Algorithms
	Author: Aileen L. Cai
	Due: February 13, 2020
*/



public class SelectionSort implements Practice03Sort
{
	public void swap(int []a, int i, int j)  //changes the positions of two items in an array 
	{
		int temp = a[i];                   
		a[i] = a[j];
		a[j] = temp;
	}

	public int findMin(int [] a, int start) 
	{
		int minimum = start; //value that we compare the rest of the items in the array against
		
		for (int i = (start + 1); i < a.length; i++)   //comparing each value against the chosen minimum

			if (a[i] < a[minimum])    
				minimum = i;   //changing the minimum

		return minimum;
	}

	public void sort(int [] a)   //sorting the data using the swap() and findMin() functions created
	{
		for (int i = 0; i < a.length-1; i++)  
			swap(a, i, findMin(a,i));   
	}
}