package com.app.Junitdemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;

//@IncludeTags("product")

//@ExcludeTags("qa")
public class IncludeExcludeTag {

	
	
	
	
	@Test
	@Tag("qa")
	public void qatest1()
	{
		System.out.println("test case development1");
	}

	@Test
	@Tag("qa")

	public void qatest2()
	{
		System.out.println("test case development2");
	}

	@Test
	@Tag("product")

	public void producttest1()
	{
		System.out.println("test case development3");
	}

	@Test
	@Tag("product")
	
	public void producttest2()
	{
		System.out.println("test case development4");
	}
	@Test
	@Tag("final")

	public void finalttest2()
	{
		System.out.println("test case development6");
	}
	@Test
	@Tag("final")

	public void finalttest1()
	{
		System.out.println("test case development5");
	}

}
