package com.hkit.bbg.oop;

public class RandomNumbers extends Numbers {

	public RandomNumbers(int no_count)
	{
		super(no_count);
		setRandomValues();
	}
	
	private void setRandomValues()
	{
		int trueCnt = 0;
		while(trueCnt < NO_COUNT)
		{
			int rValue = (int)(Math.random()*9)+1;
			if(insertValue(rValue))
			{
				trueCnt++;
			}
		}
	}
	
	
}
