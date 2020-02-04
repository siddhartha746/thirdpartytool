package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Profileupgrade_TC_00024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	         bo.get("http://dmlogics.in/build5/Loging.html");
	         
	         //userid
             bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
             Thread.sleep(1000);
             
             //password
             bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");
             Thread.sleep(1000);
             
             //login
             bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
             Thread.sleep(1000);
         
	         
	         //update profile
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/a[1]/b[1]")).click();
	         Thread.sleep(1000);
	
	         //employee id
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[1]/p[1]/input[1]")).sendKeys("125848755");
	         Thread.sleep(1000);
	
	         //first name
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[1]/p[2]/input[1]")).sendKeys("goutham");
	         Thread.sleep(1000);
	         
	         //last name
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[1]/p[3]/input[1]")).sendKeys("indian");
	         Thread.sleep(1000);
	
	         //gender
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[2]/p[2]/input[2]")).click();
	         Thread.sleep(1000);
	         
	         //experience
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[3]/p[2]/input[7]")).click();
	         Thread.sleep(1000);
	         
	         //date
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/p[5]/input[1]")).sendKeys("nov 20 2019");
	         Thread.sleep(1000);
	
	         //profession
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[4]/p[2]/input[2]")).click();
	         Thread.sleep(1000);
	
	         //profile picture
	         //bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[5]/p[2]/input[1]")).click();
	         Thread.sleep(1000);
	
	        //Automation tool
	        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[8]/p[4]/input[1]")).click();
	        Thread.sleep(1000);
	
	        //working place
	        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[9]/div[1]/select[1]")).click();
	        Thread.sleep(1000);
	
	        //additional skills
	        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[10]/div[1]/select[1]/option[2]")).click();
	        Thread.sleep(1000);
	        
	        //reset
	        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[11]/div[1]/input[1]")).click();
	        Thread.sleep(2000);
	        
	        if(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/p[5]/input[1]")).getText().equals(""))   //datefield
	        
	            System.out.println("pass");
	        else
	        	System.out.println("fail");
	        	
	        	
	        
	        
	        
	        bo.close();


	}

}
