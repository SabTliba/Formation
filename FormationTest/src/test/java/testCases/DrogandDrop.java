package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DrogandDrop {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromdriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver=new ChromeDriver();
		//maximaze window
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouverture url
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(5000);
		
		//identification et declaration des elements
		WebElement Dragme;
		WebElement Drophere;
		Dragme=driver.findElement(By.id("draggable"));
		Drophere=driver.findElement(By.id("droppable"));
		
		//action
		Actions action=new Actions(driver);
		action.dragAndDrop(Dragme, Drophere).perform();
		
		//verification 
		String texte;
		texte=Drophere.getText();
		Assert.assertEquals(texte, "Dropped!");
		System.out.println("Test OK");
		
		//fermeture chrome
		
		driver.close();
		
	}

}
