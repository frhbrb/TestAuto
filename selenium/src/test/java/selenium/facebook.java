package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement boutonCree;
		boutonCree = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		boutonCree.click();
		
		WebElement firstName ;
		firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("azea");
		
		WebElement lastName;
		lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("qsdfgh");
		
		WebElement mail;
		mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("valenza85628horchak@fakemail.io");
		
		WebElement mailconf;
		mailconf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		mailconf.sendKeys("valenza85628horchak@fakemail.io");
		
		WebElement pasword ;
		pasword = driver.findElement(By.name("reg_passwd__"));
		pasword.sendKeys("159753azerty");
		
		WebElement birthday ;
		birthday = driver.findElement(By.name("birthday_day"));
		Select dropdownName = new Select(birthday);
		dropdownName.selectByValue("15");
		
		WebElement birthmonth ;
		birthmonth = driver.findElement(By.name("birthday_month"));
		Select dropdownMonth = new Select(birthmonth);
		dropdownMonth.selectByValue("8");
		
		WebElement birthyear ;
		birthyear = driver.findElement(By.name("birthday_year"));
		Select dropdownYear = new Select(birthyear);
		dropdownYear.selectByValue("1996");
		
		WebElement gender ;
		gender = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		gender.click();
		
		WebElement submit;
		submit = driver.findElement(By.name("websubmit"));
		submit.click();
		

	}

}
