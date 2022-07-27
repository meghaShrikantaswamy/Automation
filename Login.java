package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void Test2() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\meghana.rs\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://mobileworld.azurewebsites.net/");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("meghana");
	driver.findElement(By.id("password")).sendKeys("megha@1234");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='remember-me']")).click();
	driver.findElement(By.xpath("//div[@class='form-group pt-1']")).click();
}
	
	
	
}
