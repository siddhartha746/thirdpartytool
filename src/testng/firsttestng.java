package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


//valid user id valid password

public class firsttestng {
  
 /*  @Test
  
  public void Home_TC_00011() throws InterruptedException 
  
  {
	  
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
		WebDriver bo=new FirefoxDriver();
	    bo.get("http://dmlogics.in/build5/Loging.html"); 
	    
	    //valid userid
	    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
        Thread.sleep(1000);
      
        //valid password
        bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");;
        Thread.sleep(1000);
      
        //login
        bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
        Thread.sleep(1000);
      
        Assert.assertEquals(bo.getTitle(), "MainHMR");
      
        bo.close();
	  
      
	  } 

//invalid userid valid password

@Test
public void Home_TC_00012() throws InterruptedException 
{


	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
	WebDriver bo=new FirefoxDriver();
    bo.get("http://dmlogics.in/build5/Loging.html"); 
    
    //invalid userid
    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kre");
    Thread.sleep(1200);
  
    //valid password
    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");
    Thread.sleep(1200);
  
    //login
    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[1]/center[1]/input[1]")).click();
    Thread.sleep(1200);
  
    Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid UserID");
    bo.switchTo().alert().accept();
    Thread.sleep(1200);
    bo.close();

}

//valid userid invalid password

@Test
public void Home_TC_00013() throws InterruptedException 
{

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

    Assert.assertEquals(bo.switchTo().alert().getText(), "Invalid Password");
    bo.switchTo().alert().accept();
    Thread.sleep(1200);
    bo.close();

}

//reset button

@Test
public void Home_TC_00015() throws InterruptedException 
{

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\browsers\\geckodriver.exe");
	WebDriver bo=new FirefoxDriver();
    bo.get("http://dmlogics.in/build5/Loging.html"); 
    
    //valid userid
    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[2]/td[2]/form[1]/input[1]")).sendKeys("kishore");
    Thread.sleep(1200);
  
    //valid password
    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[3]/td[2]/input[1]")).sendKeys("kishore");
    Thread.sleep(1200);
  
  //reset button
    bo.findElement(By.xpath("/html[1]/body[1]/center[1]/table[1]/tbody[1]/tr[4]/td[2]/center[1]/input[1]")).click();
    Thread.sleep(1000);
    
    Assert.assertEquals(bo.getTitle(), "HMR");
    Thread.sleep(1200);
    bo.close(); 

} 

//stations link

@Test
public void MainHMR_TC_00004() throws InterruptedException 
{

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
    
    //stationslink
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[1]/b[1]")).click();
    Thread.sleep(2000);
    
    Assert.assertEquals(bo.getTitle(), "stations");
    Thread.sleep(1000);
        
    bo.close();
    
}

//update profile and skills link

@Test
public void MainHMR_TC_00005() throws InterruptedException 
{

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
    
    //update profile & skills link
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/a[1]/b[1]")).click();
    Thread.sleep(2000);
    
    Assert.assertEquals(bo.getTitle(), "AplHmr");
    Thread.sleep(1000);
        
    bo.close();
    
}

//update address link

@Test
public void MainHMR_TC_00006() throws InterruptedException 
{
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
    Thread.sleep(2000);
    
    Assert.assertEquals(bo.getTitle(), "update profile");
    Thread.sleep(1000);
        
    bo.close();
    
}

//logout link

@Test
public void MainHMR_TC_00007() throws InterruptedException 
{
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
    
   //logout link
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/a[1]/b[1]/font[1]")).click();
    Thread.sleep(2000);
    
    Assert.assertEquals(bo.getTitle(), "HMR");
    Thread.sleep(1000);
        
    bo.close();
    
}
//profileupgrade reset button

@Test
public void Profileupgrade_TC_00024() throws InterruptedException 
{
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
    
    //update profile & skills link
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/a[1]/b[1]")).click();
    Thread.sleep(2000);	
    
    //Date text filed
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/p[5]/input[1]")).sendKeys("nov 25 2019");
    Thread.sleep(2000);	
    
    //reset button
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[11]/div[1]/input[1]")).click();
    Thread.sleep(2000);
    
    Assert.assertEquals(bo.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/fieldset[1]/div[8]/p[4]/input[1]")).getText(), "");
    Thread.sleep(2000);
        
    bo.close();
    
}
//station page back button


@Test
public void Station_TC_00006() throws InterruptedException 
{
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
    
    //stations halts to monitor link
	bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/a[1]/b[1]")).click();
	Thread.sleep(1200);
	
	//back button
	bo.findElement(By.xpath("/html[1]/body[1]/div[3]/a[1]/button[1]")).click();
	Thread.sleep(2000);
    
    Assert.assertEquals(bo.getTitle(), "MainHMR");
    Thread.sleep(2000);
        
    bo.close();
    
} */

//update address submit button

@Test
public void Updateaddress_TC_00009() throws InterruptedException 
{
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
    
    //submit button
    bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/form[1]/fieldset[1]/input[4]")).click();
    Thread.sleep(2000);

    
    Assert.assertEquals(bo.getTitle(), "updateprofile");
    Thread.sleep(2000);
        
    bo.close();
    
}

}




