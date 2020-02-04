package programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cssformulas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("http://dmlogics.in/build5/Loging.html");
	    
	    // tag and attribute
	    
	    bo.findElement(By.cssSelector("input[name=id]")).sendKeys("kishore");
	    
	    Thread.sleep(1000);
	    
	    bo.findElement(By.cssSelector("input[type=password]")).sendKeys("kishore");
	    
	    Thread.sleep(1000);
	    
	    bo.findElement(By.cssSelector("input[value=Login]")).click();
	    
	    Thread.sleep(1000);
	    
	    

	}

}
