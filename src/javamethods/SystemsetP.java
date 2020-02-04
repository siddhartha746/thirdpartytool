package javamethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SystemsetP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("key", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();

	}

}


// run the program to get the key value. which is  webdriver.gecko.driver
//value can be obtained from right to left direction. geckodriver-browsers-desktop-user-users-c. convert single slash to double.