package com.interfaces;

public interface ICalc {

	public int operation(int a, int b);
	
	public default int op(int a, int b)
	{
		return a+b;
	}
	
	public static int aa(int x, int y)
	{
		return x-y;
	}
}
