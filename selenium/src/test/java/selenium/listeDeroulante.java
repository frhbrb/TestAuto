package selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listeDeroulante {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement liste;
		liste = driver.findElement(By.id("oldSelectMenu"));
		
		// SELECT 
		Select dropdown = new Select(liste); 
		dropdown.selectByValue("5");
		System.out.println("ok");
		
		
	}

}
