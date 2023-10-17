package com.app.Junitdemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensiondemoConditions {
	
	
	
	@Test
	@EnabledOnOs(OS.MAC)
	public void conditionOS()
	{
		System.out.println("execute test case on mac");
	}
	@Test
	@EnabledOnJre(JRE.JAVA_14)

	public void conditionJRE()
	{
		System.out.println("execute test case on JAVA VERSION");
	}
	
	@Test
	@EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_20)
	public void conditionJRErange()
	{
		System.out.println("execute test case on java vaersion 11 to 20");
	}

}
