package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver;
	  String result;
	  String plan;
	 

		//WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://subscribe.stctv.com/");
		driver.findElement(By.xpath("//a[@id='country-btn']")).click();
		//result = driver.findElement(By.xpath("//body[@dir='rtl']")).getText();
		result = driver.findElement(By.xpath("//a[@id='eg']")).getText();
		plan   = driver.findElement(By.xpath("//div[@class='plan-row']")).getText();
		Assert.assertEquals(result, "مصر"); 
		Assert.assertEquals(plan, "");
		//driver.quit();
       
	  
  }


}
