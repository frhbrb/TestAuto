package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class doubleclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		
		// DOUBLE CLICK
		WebElement bouton ;
		bouton = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(bouton).perform();
		
		WebElement msg;
		msg = driver.findElement(By.id("doubleClickMessage"));
		String text = msg.getText();
		org.testng.Assert.assertEquals(text, "You have done a double click");
		System.out.println("Test Ok");
		
		
		// RIGHT CLICK
		WebElement right ;
		right = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(right).perform();
		
		WebElement msgright ;
		msgright = driver.findElement(By.id("rightClickMessage"));
		String textright = msgright.getText();
		org.testng.Assert.assertEquals(textright, "You have done a right click");
		System.out.println("right click OK");
		
		
		// SIMPLE CLICK
		WebElement one ;
		one = driver.findElement(By.xpath("//div[3]//button[1]"));
		one.click();
		
		WebElement msgone ;
		msgone = driver.findElement(By.id("dynamicClickMessage"));
		String textone = msgone.getText();
		Assert.assertEquals(textone, "You have done a dynamic click");
		System.out.println("simple click OK");
		
		
		
		
		
	

	}

}
