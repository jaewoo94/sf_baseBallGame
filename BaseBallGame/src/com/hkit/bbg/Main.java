package com.hkit.bbg;

public class Main {
	public static void main(String[] args)
	{
		
		final int NO_COUNT = 3;
		int[] noArray = new int[NO_COUNT];
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		int randomValue = (int)(Math.random()*9)+1;
		
		int[] flag = new int[9];
		
		for(int i = 0; i < NO_COUNT; i++)
		{
			randomValue = (int)(Math.random()*9)+1;
			if(flag[randomValue-1] == 0)
			{
				randomNoArray[i] = randomValue;
				flag[randomValue-1] = 1;		
			}
			else
			{
				i--;
			}
		}
		
		for(int item : randomNoArray) {
			System.out.println(item);
		}
	}
}
