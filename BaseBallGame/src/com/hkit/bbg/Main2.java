package com.hkit.bbg;

import java.util.Scanner;

public class Main2 {
	
	final static int NO_COUNT = 3;
	
	public static void main(String[] args)
	{
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		Scanner scan = new Scanner(System.in);
		
		setRandomArray(randomNoArray);
		
		for(int item : randomNoArray)
		{
			System.out.print(item);
		}
		System.out.println();
		
		while(true)
		{
			setUserArray(scan, userNoArray);
			int s = checkFinish(randomNoArray,userNoArray);
			if( s == NO_COUNT)
			{
				System.out.println("-- 게임 종료 --");
				break;
			}
		}
		
		scan.close();
	}
	
	//랜덤배열 생성 메소드
	public static void setRandomArray(int[] randomNoArray)
	{
		int randomValue = (int)(Math.random()*9)+1;
		int[] flag = new int[9];
		
		for(int i = 0; i < randomNoArray.length; i++)
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
	}
	
	//유저 배열 생성 메소드
	public static void setUserArray(Scanner scan, int[] userNoArray)
	{
		
		int[] flag = new int[9];
		
		for(int i = 0; i < userNoArray.length; i++)
		{
			System.out.print("값을 입력해주세요 : ");
			int value = scan.nextInt();
			if(1<= value && value <= 9)
			{
				if(flag[value-1] == 0)
				{
					userNoArray[i] = value;	
					flag[value-1] = 1;
				}
				else
				{
					i--;
				}		
			}
			else
			{
				i--;
			}
		}
		
		for(int i : userNoArray)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	

	//결과 도출 메소드
	public static int checkFinish(int[] randomNoArray,int[] userNoArray)
	{
			int s = 0;
			int b = 0;
			int o = NO_COUNT;

			for(int i =0; i<NO_COUNT; i++)
			{
				for(int j = 0; j<NO_COUNT; j++)
				{
					if(randomNoArray[i] == userNoArray[j])
					{
						if(i==j)
						{
							s++;
							o--;
						}
						else
						{
							b++;
							o--;
						}
					}
				}
				
			}
			System.out.println("S : " + s + "|B : "+b+ "|O : "+o);
			
			return s;
			
	}
		
}
