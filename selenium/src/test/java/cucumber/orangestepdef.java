package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangestepdef   {
	WebDriver driver ;
	@Given("ouvrir navigateur chrome")
	public void ouvrir_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("saisir lurl {string}")
	public void saisir_lurl(String string) {
		driver.get(string);
	}

	@When("saisir username {string}")
	public void saisir_username(String string) {
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(string);
	}

	@When("saisir password {string}")
	public void saisir_password(String string) {
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys(string);
	}

	@When("cliquer sur bouton login")
	public void cliquer_sur_bouton_login() {
		WebElement bouton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		bouton.click();
	}
	
	
	@Then("verifier lacces {string}")
	public void verifier_lacces(String string) {
		String url = driver.getCurrentUrl();
		if (url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")) {
			WebElement profil = driver.findElement(By.xpath("//p[contains(text(),'Paul Collings')]"));
			String txt = profil.getText();
			Assert.assertEquals(txt, string);
			System.out.println("passant ok");
		}
		else if (url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			WebElement erreur = driver.findElement(By.xpath("//p[normalize-space()='Invalid credentials']")) ;
			String msg = erreur.getText();
			Assert.assertEquals(msg, string);
			System.out.println("non passant OK");
		}
		driver.close();
		
	}

	
	
	


}
