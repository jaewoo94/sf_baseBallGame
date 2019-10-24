package com.hkit.bbg.oop;

public class Game {
	public void startGame(int no_cnt)
	{
		int test = 0;
		RandomNumbers rnb = new RandomNumbers(no_cnt);
		Result result = new Result(no_cnt);
		
		for(int item : rnb.getArray())
		{
			System.out.print(item + ", ");
		}
		
		while(true)
		{
			test++;
			UserNumbers unb = new UserNumbers(no_cnt);
			unb.setUserNumbers();
			
			if(Check.check(result, rnb, unb))
			{
				System.out.println("-- 게임종료 --");
				System.out.printf("%d 시도 끛" , test);
				break;
			}
		}
	}
	
}
