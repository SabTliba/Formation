package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// identification (chemin) chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		// maximaze window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		
		// ouvrir URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		// declaration et identification des elements
		WebElement Username;
		Username = driver.findElement(By.name("username"));
		WebElement password;
		password = driver.findElement(By.name("password"));
		WebElement login;
		login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		//Action
		Username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		Thread.sleep(5000);
		WebElement profil;
		profil=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		String texte;
		texte=profil.getText();
		Assert.assertEquals(texte,"MUHAMMAD ANWAR");
		System.out.println("test OK");
		driver.close();
		
		
		
		
		
	}
}
