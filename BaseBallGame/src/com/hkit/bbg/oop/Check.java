package com.hkit.bbg.oop;

public class Check {
	//게임이 종료되면 return true, 종료되지 않으면 return false
	public static boolean check(Result res, Numbers num1, Numbers num2)
	{
		boolean result = false;
		
		int[] num1Arr = num1.getArray();
		int[] num2Arr = num2.getArray();
		
		int s = 0, b = 0;
		
		for(int i = 0 ; i < res.NO_COUNT; i++)
		{
			for(int j= 0; j< res.NO_COUNT; j++)
			{
				if(num1Arr[i] == num2Arr[j])
				{
					if(i==j)
					{
						s++;
					}
					else
					{
						b++;	
					}
				}
			}
		}
		
		res.setValues(s, b);
		res.showResult();
		
		if(s == res.NO_COUNT)
		{
			result = true;
		}
		
		return result;
	}
}
