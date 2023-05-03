package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OuvrirChrome {

	public static void main(String[] args) {
		// path
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture chrome
		WebDriver driver = new ChromeDriver();
		// maximiser la fenetre
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		// URL
		driver.get("https://google.com/");
		driver.navigate().to("https://google.com/");
		
		
	}

}
