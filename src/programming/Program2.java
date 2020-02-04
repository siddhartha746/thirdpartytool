package programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
		bo.get("http://dmlogics.in/build5/Loging.html");
		Thread.sleep(3000);
		String pt=bo.getTitle();
		System.out.println(pt);
		String crl=bo.getCurrentUrl();
		System.out.println(crl);
		String PS=bo.getPageSource();
		System.out.println(PS);
		
	
		bo.navigate().to("https://www.redbus.in/");
		Thread.sleep(3000);
		bo.navigate().back();
		Thread.sleep(3000);
		bo.navigate().forward();
		Thread.sleep(3000);
		bo.navigate().refresh();
		Thread.sleep(4000);
		bo.close();
	}

}
