package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Testcase1 {
	
	WebDriver bo;
	String buildpath="http://dmlogics.in/build5/Loging.html";

	@Test
	public void Home_TC_00011() throws InterruptedException {
		  
		//valid userid
		    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
	      Thread.sleep(1000);
	    
	      //valid password
	      bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");;
	      Thread.sleep(1000);
	    
	      //login
	      bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
	      Thread.sleep(1000);
	    
	      Assert.assertEquals(bo.getTitle(), "MainHMR");

	  }

}
