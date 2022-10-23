package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage  {
 

	  WebDriver driver;
		
		//Constructeur qui sera appelé automatiquement dès que l'objet de la classe sera créé
		public HomePage(WebDriver driver) {
			this.driver=driver;
		}
		
		//Localisateur du bouton de connexion
		By LoginBtn = By.xpath("//button[normalize-space()='Login']");
		
		//Méthode pour cliquer sur le bouton de connexion
		public void clickLogin() {
			driver.findElement(LoginBtn).click();
		}

}
