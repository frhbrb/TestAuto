package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class identElement {
	WebDriver driver;
	
	
	// identifi des elements
	@FindBy(how=How.NAME , using = "username")
	public static WebElement name ;
	
	@FindBy(how=How.NAME , using = "pasword")
	public static WebElement pasword ;
	
	@FindBy(how=How.XPATH , using = "//button[normalize-space()='Login']")
	public static WebElement login ;
	
	@FindBy(how=How.XPATH , using = "//p[contains(text(),'Paul Collings')]")
	public static WebElement profil ;
	
	// creation des methodes
	
	public void ouvertureUrl(String url) {
		driver.get(url);
	}
	
	public void remplirUser(String user) {
		name.sendKeys(user);
	}
	
	public void remplirPasword(String pass) {
		pasword.sendKeys(pass);
	}
	
	public void cliquerLogin(){
		login.click();
	}
	
	public static String text() {
		String message = profil.getText();
		return message;
		
	}
	

}
