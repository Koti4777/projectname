package com.automation.sample;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TestNGClass {

	 @Test
	    public void shouldAnswerWithTrue()
	    {
	      Reporter.log("test case one edit");
	    }
	 
	 @Test
	    public void shouldAnswerWithTrue1()
	    {
		 Reporter.log("test case two edit");
		  String str2="two";
	       Assert.assertEquals("two", str2,"testng testing");
	      
	    }
	 
	 @Test
	    public void shouldAnswerWithTrue2()
	    {
		 Reporter.log("Test case three jfhjfkdj ");
	       String str2="two";
	       Assert.assertEquals("two", str2);
	       Reporter.log("Test case three");
	       Reporter.log("\n"+"Test case next line");
	       
	    }
}
