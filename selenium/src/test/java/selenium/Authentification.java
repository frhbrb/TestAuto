package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// sleep
		Thread.sleep(5000);
		
		// identification web element
		WebElement user;
		user = driver.findElement(By.name("username"));
		// action
		user.sendKeys("Admin");
		
		
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		
		// identification bouton
		WebElement bouton;
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		bouton.click();
		
		Thread.sleep(7000);
		// Assert
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text = profil.getText();
		Assert.assertEquals("Paul Collings", text);
		System.out.println("test Ok");
		
		

	}

}
