package mobile_world;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Home {
	@Test
	public void Test3() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\meghana.rs\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	
	 driver.findElement(By.id("navbarDropdown")).click();//latest home
     driver.findElement(By.xpath("//a[@href='#samsung']")).click();//Samsung 
     driver.findElement(By.xpath("(//a[.='More Details'])[1]")).click();//more details
     driver.findElement(By.id("myInput")).sendKeys("sam");
     driver.findElement(By.id("navbarDropdown")).click();//support click
     driver.findElement(By.xpath("//a[@href='order.html']")).click();//order click

     Set<String>win=driver.getWindowHandles();
     Iterator<String>it=win.iterator();//switch window
     String parent=it.next();
     String ChildId=it.next();
     driver.switchTo().window(ChildId);
     //order page 
     driver.findElement(By.id("inputFirstName")).sendKeys("meghana");
     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rs");
     driver.findElement(By.id("inputEmail")).sendKeys("megha@gmail.com");
     driver.findElement(By.id("inputPassword")).sendKeys("meghana@abc");
     driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876556789");
//     driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
     
     driver.findElement(By.xpath("//*[@id=\"flexRadioDefault2\"]")).click();
     driver.findElement(By.id(" address1")).sendKeys("mandya");
     driver.findElement(By.id("address2")).sendKeys("malavalli");
     driver.findElement(By.id("inputCity")).sendKeys("Banglore");
     //city dropdown
      WebElement staticDropdown1=driver.findElement(By.id("inputState"));
      Select dropDown1=new Select(staticDropdown1);
      dropDown1.selectByVisibleText("Karnataka");
     //System.out.println(dropDown1.getFirstSelectedOption().getText());
      //zip
      driver.findElement(By.id("inputZip")).sendKeys("560024");

      driver.findElement(By.xpath("(//option[@id='Samsung'])[1]")).click();

      driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("2");
      // bought dropdown
      WebElement staticDropdown2=driver.findElement(By.id("bought"));
         Select dropdown2=new Select(staticDropdown2);
         Thread.sleep(2000);
         dropdown2.selectByVisibleText("No");
         //driver.findElement(By.xpath("//input[@id='time']")).sendKeys("1");
         Thread.sleep(2000);
         //dropdown2.selectByVisibleText("No");

         driver.findElement(By.xpath("(//input[@id='gridCheck1'])[1]")).click();
         driver.findElement(By.xpath("(//input[@id='gridCheck1'])[2]")).click();

         driver.findElement(By.xpath("//button[@type='button']")).click();
         Thread.sleep(5000);
         //Alert a2=driver.switchTo().alert();
         //a2.accept();
         driver.findElement(By.xpath("//a[.='Close']")).click();
	}
	
	

	
	
}
