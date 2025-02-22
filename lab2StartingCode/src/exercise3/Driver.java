package exercise3;

import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String[] args )
	{
		if (args.length == 0) 
		{
			System.out.println("provide a sorting alg: b, i, s, q");
			return;
		}
		
		char choice = args[0].charAt(0);
		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
		}
		
		System.out.println("Before sorting:");
		printArray(nums);
		
		switch (choice) 
		{
			case 'q':
				quickSort(nums, 0, nums.length - 1);
				break;
			case 'b':
			case 'i':
			case 's':
				System.out.println("Hi, this is nothing");
				return;
			default:
				System.out.println("Invalid choice");
				return;
		}
		
		System.out.println("\nAfter sorting:");
		printArray(nums);
		
	}
	
	private static void printArray(Integer[] arr) 
	{
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
	
	private static void quickSort(Integer[] arr, int low, int high) 
	{
		if (low < high) 
		{
			int p = reorder(arr, low, high);
			quickSort(arr, low, p - 1);
			quickSort(arr, p + 1, high);
		}
	}
	
	private static int reorder(Integer[] arr, int low, int high)
	{
		int i = low - 1;
		
		for (int j = low; j < high; j++)
		{
			if (arr[j] > arr[high]) 
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}
	
	private static void swap(Integer[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
