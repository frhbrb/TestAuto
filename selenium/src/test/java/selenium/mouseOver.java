package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class mouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/menu");
		
		WebElement menu ;
		menu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		String txt = menu.getText();
		Assert.assertEquals(txt, "Main Item 2") ;
		System.out.println("menu txt ok");
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		WebElement sub ;
		sub = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		String textsub = sub.getText();
		Assert.assertEquals(textsub, "SUB SUB LIST »");
		System.out.println("sub text ok");
		
		
		action.moveToElement(sub).perform();
		System.out.println("test ok");
		driver.close();	
			

			}

		}

