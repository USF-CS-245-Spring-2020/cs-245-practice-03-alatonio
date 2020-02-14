/*
	BubbleSort.java
	Data Structures and Algorithms
	Author: Aileen L. Cai
	Due: February 13, 2020
*/



public class BubbleSort implements Practice03Sort
{
	public void swap(int []a, int i, int j)  //changes the positions of two items in an array 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void sort(int []a)
	{
		int loops = 1;    
		boolean switched = true;  //boolean for whether values in array switched positions 

		while (switched)  //condition in which while loop runs
		{
			switched = false;
			for (int i = 0; i < (a.length - loops); i++)  //(a.length - loops) prevents out of bound error  
				if (a[i] > a[i+1])    //if the value in the array is greater than the one after it 
				{
					swap(a, i, i +1); //swap their positions so the array is getting sorted in ascending order 
					switched = true;  //keeps while loop running
				}
				
		}
	}
}

