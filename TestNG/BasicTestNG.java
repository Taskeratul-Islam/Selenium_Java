package com.TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTestNG {
	
	/*
	 * Priority Rules
	 * 1.Priority could be negative , zero and positive
	 * 2.small priority gets more important
	 * 3.by default TestNG provides zero priority to all @Test
	 * 4.When two @Test share same priority then execution in alphabetical order among
	 * 5.Method name start with capital letter will get priority 
	 */
	@Test(priority= 0)
	public void function1() {

		// Assert.fail("Forcefully failed");

		System.out.println("TestNG function 1 ");
	}

	@Test(priority= 0)
	public void Function2() 
	{

		System.out.println("TestNG function 2");
	}
	@Test( priority= -1)
	public void function3( )
	{

		System.out.println("TestNG function 3");

	}
	@Test( description = "This is demo description")
	public void Content( )
	{

		System.out.println("TestNG function 4");

	}
	
}

