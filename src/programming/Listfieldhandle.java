package programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Listfieldhandle {

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
	         
	         //first name
	         bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[1]/p[2]/input[1]")).sendKeys("goutham");
	         Thread.sleep(1000);
	         
	         //working place list field-ameerpet
	         bo.findElement(By.xpath("//html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[9]/div[1]/select[1]/option[7]")).click();
	         Thread.sleep(2000);
	         
	         
	         bo.close();

	}

}
