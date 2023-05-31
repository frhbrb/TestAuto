package cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class creationstep {
	WebDriver driver ;
	
	@Given("ouvrir navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS) ;
	}
	
	

	@Given("saisir url {string}")
	public void saisir_url(String string) {
	    driver.get(string);
	}
	
	

	@When("cliquer sur le bouton creation d un nouveau compte")
	public void cliquer_sur_le_bouton_creation_d_un_nouveau_compte() {
	    WebElement boutoncrea = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
	    boutoncrea.click();
	}
	

	
	@When("saisir prenom {string}")
	public void saisir_prenom(String string) {
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys(string);
	}
	
	

	@When("saisir nom {string}")
	public void saisir_nom(String string) {
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys(string);
	}
	
	

	@When("saisir e-mail {string}")
	public void saisir_e_mail(String string) {
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys(string);
	}
	
	@When("saisir e-mail de confirmation {string}")
	public void saisir_e_mail_de_confirmation(String string) {
		WebElement mailconf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		mailconf.sendKeys(string);
	}
	
	
	

	@When("saisir Nouveau mot de passe {string}")
	public void saisir_nouveau_mot_de_passe(String string) {
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(string);
	}
	
	

	@When("choisir birthday_day {string}")
	public void choisir_birthday_day(String string) {
		WebElement birthday ;
		birthday = driver.findElement(By.name("birthday_day"));
		Select dropdownName = new Select(birthday);
		dropdownName.selectByValue(string);
	}
	
	

	@When("choisir birthday_month {string}")
	public void choisir_birthday_month(String string) {
		WebElement birthmonth ;
		birthmonth = driver.findElement(By.name("birthday_month"));
		Select dropdownMonth = new Select(birthmonth);
		dropdownMonth.selectByValue(string);
	}
	
	

	@When("choisir birthday_year {string}")
	public void choisir_birthday_year(String string) {
		WebElement birthyear ;
		birthyear = driver.findElement(By.name("birthday_year"));
		Select dropdownYear = new Select(birthyear);
		dropdownYear.selectByValue(string);
	}
	
	

	@When("choisir genre {string}")
	public void choisir_genre(String string) {
		WebElement gender ;
		String f,h ;
		f = "femme" ;
		h = "homme";
	    if (string.equalsIgnoreCase(f)) {
	    	gender = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
			gender.click();
	    }
	    else if (string.equalsIgnoreCase(h)) {
	    	gender = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
			gender.click();
	    }
	   
	    	
	}
	
	@When("choisir genre {string} et choisir {string}")
	public void choisir_genre_et_choisir(String string, String string2) {
		WebElement gender ;
		gender = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
		gender.click();
		
		WebElement liste = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		Select select = new Select(liste);
		select.selectByValue(string2);
	}

	
	
	@When("cliquer sur le bouton s inscrire")
	public void cliquer_sur_le_bouton_s_inscrire() {
		WebElement submit = driver.findElement(By.name("websubmit"));
		submit.click();
	}

	@Then("verifier linscription")
	public void verifier_linscription() {
	   System.out.println("ok");
		
	}


}
