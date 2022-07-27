package mobile_world;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {
	
@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\meghana.rs\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://mobileworld.azurewebsites.net/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//a[@href='signup.html']")).click();
			driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("meghana");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("RS");
			driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("meghana@gmail.com");
			driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("megha@1234");
			driver.findElement(By.xpath("//input[@type='date']")).sendKeys("02/12/1996");
			driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8296698336");
			driver.findElement(By.xpath("//textarea[@rows='3'] ")).sendKeys("Hello Qualitester");
			driver.findElement(By.xpath("//button[@type='Submit']")).click();
			Thread.sleep(2000);
			Alert a1=driver.switchTo().alert();
			a1.accept();
			Thread.sleep(2000);
		
		
}
}
