package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)	;	
		driver.get("https://www.youtube.com/");
		
		
		WebElement recherche ;
		recherche = driver.findElement(By.name("search_query"));
		recherche.sendKeys("Tunisie");
		
		WebElement icone;
		icone = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
		icone.click();
		
		
		 String url = driver.getCurrentUrl();
		 Assert.assertEquals(url , "https://www.youtube.com/results?search_query=Tunisie");
		 System.out.println("test is OK");
		
		
		
		

	}

}
