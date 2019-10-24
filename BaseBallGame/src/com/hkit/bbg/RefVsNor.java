package com.hkit.bbg;

public class RefVsNor {
	//일반 변수, 레퍼런스 변수 차이
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nmValue = 10;
		Temp temp = new Temp();
		temp.refvalue = 10;
		
		change(nmValue);
		change(temp);
		
		System.out.println("nmValue : " + nmValue);
		System.out.println("refValue : " + temp.refvalue);
	}
	public static void change(int v)
	{
		v = 30;
	}
	
	public static void change(Temp t)
	{
		t.refvalue = 30;
	}

}

class Temp{
	int refvalue;
}