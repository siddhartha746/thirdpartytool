package programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		//System.setProperty(key, "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("https://www.redbus.in/");
		String pt=bo.getTitle();
		System.out.println(pt);
		bo.close();

	
	}
}
