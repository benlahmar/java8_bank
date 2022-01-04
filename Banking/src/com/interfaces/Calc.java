package com.interfaces;

public class Calc {

	public int apply(int a, int b, ICalc op)
	{
		return op.operation(a, b);
	}
}
