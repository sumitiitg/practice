package gitpractice;

import java.io.*;
import java.util.*;
import java.lang.*;
public class Assignment 
{
	public void test()
	{
		Scanner sc = new Scanner(System.in);
		int nTests = sc.nextInt();
		for (int i = 0 ; i < nTests ; i++)
		{
			int arrLen = sc.nextInt();
			int arr[][] = new int[arrLen][arrLen];
			for (int j = 0 ; j < arrLen ; j++)
				for (int k = 0 ; k < arrLen ; k++)
					arr[j][k] = sc.nextInt();
			processTest(arr);
		}
	}
	
	public void processTest(int arr[][])
	{
	    int sol[][] = new int[arr.length][arr.length];
	    for (int i = 0 ; i < arr.length ; i++)
	    	sol[0][i] = i;
	    
		for (int i = 1 ; i < arr.length ; i++)
		{
			for (int j = 0 ; j < arr.length ; j++)
			{
				sol[i][j] = findMin(sol, i, j, arr);
			}
		}
	}
	
	private int findMin(int sol[][], int row, int col, int arr[][])
	{
		boolean tempArr[] = new boolean[arr[0].length];
		for (int i = 0 ; i < arr[0].length; i++)
			tempArr[sol[i][col]] = true;
		int workingArr[] = new int[arr[0].length - row];
		for (int i = 0 ; i < row ; i++)
		{
			
		}
		return 0;
	}
	
	public static void main(String args[])
	{
		Assignment a = new Assignment();
		a.test();
	}
}
