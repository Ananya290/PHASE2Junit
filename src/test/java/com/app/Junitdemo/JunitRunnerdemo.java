package com.app.Junitdemo;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectClasses(com.app.Junitdemo.IncludeExcludeTag.class)
//@IncludeTags({"qa"})
@ExcludeTags("qa")
public class JunitRunnerdemo {
	
	
	

}
