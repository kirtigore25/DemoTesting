package com.test;

import static org.junit.Assert.*;


import org.junit.Test;

import com.app.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int exp=30;
		Calculator cal=new Calculator();
		int act=cal.add(10, 20);
		assertEquals(exp,act);
		
		
	}
	@Test
	public void newTest()
	{
		System.out.println("Temporary Test-a trail test");
	}

	@Test
	public void testDiv()
	{
		System.out.println("divide");
	}
}
