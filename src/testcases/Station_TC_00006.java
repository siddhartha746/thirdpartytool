package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Station_TC_00006 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("http://dmlogics.in/build5/Loging.html"); 
	    
	    //userid
	    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
        Thread.sleep(1200);
        
        //password
        bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");
        Thread.sleep(1200);
        
      //login
        bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
        Thread.sleep(1200);
        
       
        
        	//stations halts to monitor link
        	bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[1]/b[1]")).click();
        	Thread.sleep(1200);
        
        	//back button
        	bo.findElement(By.xpath("/html[1]/body[1]/div[3]/a[1]/button[1]")).click();
        	Thread.sleep(2000);
        	
        	if(bo.getTitle().equals("MainHMR"))
        		System.out.println("pass");
        	else
        		System.out.println("fail");
        	
        	bo.close();
        	
        	
        	
        	
  
        	
	}

	}


