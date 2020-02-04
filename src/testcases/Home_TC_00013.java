package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home_TC_00013 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("http://dmlogics.in/build5/Loging.html"); 
	    
	    //valid userid
	    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
        Thread.sleep(1200);
        
        //invalid password
        bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kie");
        Thread.sleep(1200);
        
      //login
        bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
        Thread.sleep(1200);
        
        System.out.println(bo.switchTo().alert().getText());
        
        if(bo.switchTo().alert().getText().equals("Invalid Password"))
        		System.out.println("pass");
        else
        	System.out.println("fail");
        
        bo.switchTo().alert().accept();
        Thread.sleep(1500);
        bo.close();

	}

}
