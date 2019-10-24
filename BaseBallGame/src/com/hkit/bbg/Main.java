package com.hkit.bbg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		final int NO_COUNT = 3;
		int[] noArray = new int[NO_COUNT];
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		int randomValue = (int)(Math.random()*9)+1;
		
		
		//랜덤값 3개 추출 중복 없음 
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
		
		//콘솔에서 값을 입력받기 위한 객체 중복 안됨
		Scanner scan = new Scanner(System.in);
		flag = new int[9];
		/*
		for(int i = 0; i < NO_COUNT; i++)
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
		scan.close();
		
		for(int i : userNoArray)
		{
			System.out.print(i);
		}

		System.out.println();
		*/
		
		for(int item : randomNoArray)
		{
			System.out.print(item);
		}
		System.out.println();
		int s = 0;
		int b = 0;
		int o = NO_COUNT;
		// 결과 도출
		while(true)
		{	
			s = 0;
			b = 0;
			o = NO_COUNT;
			flag = new int[9];
			for(int i = 0; i < NO_COUNT; i++)
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
			if( s== NO_COUNT)
			{
				System.out.println("-- 게임 종료 --");
				break;
			}
		}
		scan.close();
		
	}
}
