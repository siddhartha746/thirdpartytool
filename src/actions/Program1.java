package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();	    
		bo.get("http://apps.qaplanet.in/qahrm/login.php"); 
	    
	    //userid
	    bo.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/input[1]")).sendKeys("qaplanet1");
        Thread.sleep(1000);
        
        //password
        bo.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("lab1");
        Thread.sleep(1000);
        
        //login
        bo.findElement(By.xpath("/html[1]/body[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/input[1]")).click();
        Thread.sleep(1000);
        
        Actions ac=new Actions(bo);
        
        ac.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
        Thread.sleep(2000);
        
        ac.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Qualification')]"))).perform();
        Thread.sleep(2000);
        
        ac.moveToElement(bo.findElement(By.xpath("//span[contains(text(),'Education')]"))).perform();
        Thread.sleep(2000);
        
        bo.findElement(By.xpath("//span[contains(text(),'Education')]")).click();
        Thread.sleep(4000);
        
        ac.click(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin'"))).perform(); //short cut
        
        //ac.moveToElement(bo.findElement(By.xpath("//span[@class='drop'][contains(text(),'Admin')]"))).perform();
        //Thread.sleep(2000);

        
        bo.close();
        
        

	}

}
