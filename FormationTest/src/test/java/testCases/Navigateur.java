package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {
		// identification( chemin) ChromeDriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture Chrome
		WebDriver driver;
		driver = new ChromeDriver();

		// maximaze window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();

		// ouvrir URL
		// driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");

		// declaration des variables
		WebElement recherche;

		// identification des variables
		recherche = driver.findElement(By.name("q"));

		// action
		recherche.sendKeys("Tunisie");

		// close chrome
		// driver.close();

	}

}
