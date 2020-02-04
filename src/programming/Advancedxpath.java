package programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Advancedxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("http://dmlogics.in/build5/Loging.html"); 
	    
	    //chropath
	    
	    //bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
	    
	    //xpath= //tagname[starts-with(@attribute name,‘value‘)]-working
	    
	    //bo.findElement(By.xpath("//input[starts-with(@type,'te')]")).sendKeys("siddu");
	    
	    Thread.sleep(1000);
	    
	    //xpath= //tagname[contains(@attribute name,‘Value‘)]-working
	    
	    //bo.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("goutham");
	    
	    Thread.sleep(1000);
	    
	    //bo.findElement(By.xpath("//*[text()='id']")).sendKeys("rambabu"); ??? - not working
	    
	    
	    
	    
	    
	    bo.close();
	    

	}

}
