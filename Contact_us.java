package mobile_world;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact_us {
	@Test
	public void Test4()
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\meghana.rs\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.get("https://mobileworld.azurewebsites.net");
	driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
	driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
	//driver.manage().window().maximize();
	Set<String>win=driver.getWindowHandles();
	Iterator<String>it=win.iterator();//switch window
	String parent=it.next();
	String ChildId=it.next();
	driver.switchTo().window(ChildId);
	driver.findElement(By.name("name")).sendKeys("meghana");
	driver.findElement(By.name("email")).sendKeys("megha@20gmail.com");
	driver.findElement(By.name("phone")).sendKeys("9876543211");
	driver.findElement(By.name("message")).sendKeys("hey qualitester");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
}
