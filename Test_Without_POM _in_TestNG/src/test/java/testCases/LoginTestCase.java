package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	static WebDriver driver;

	@Test
	public void main() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/books");
		driver.manage().window().maximize();

		// Creating object of home page
		HomePage home = new HomePage(driver);

		// Creating object of Login page
		LoginPage login = new LoginPage(driver);

		// Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);

		// Click on Login button
		home.clickLogin();

		// Enter username & password
		login.enterUsername("gunjankaushik");
		login.enterPassword("Password@123");

		// Click on login button
		login.clickLogin();

		// wait until the log out button is displayed
		WebDriverWait w = new WebDriverWait(driver, 3);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));

		// Capture the page heading and print on console
		System.out.println("Le titre de la page est --- " + dashboard.getHeading());

		// Click on Logout button
		dashboard.clickLogout();

		// Close browser instance
		// driver.quit();
	}
}
