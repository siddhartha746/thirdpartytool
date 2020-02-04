package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Updateaddress_TC_00009 {

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
        
        //update address link
        
        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/a[1]/b[1]")).click();
        Thread.sleep(1000);
        
        //employee id textfield
        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/fieldset[1]/input[1]")).sendKeys("12457");
        Thread.sleep(1000);
        
        //first name
        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/fieldset[1]/input[2]")).sendKeys("ram");
        Thread.sleep(1000);
        
        //last name
        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/fieldset[1]/input[3]")).sendKeys("teju");
        Thread.sleep(1000);
        
        //address
        bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/fieldset[1]/textarea[1]")).sendKeys("hyderabad");
	    Thread.sleep(1000);
	    
	    //submit
	    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/fieldset[1]/input[4]")).click();
	    Thread.sleep(2000);
	    
	    if(bo.getTitle().equals("updateprofile"))
	    	System.out.println("pass");
	    else
	    	System.out.println("fail");
	    
	    bo.close();
	    	
	    


	}

}
