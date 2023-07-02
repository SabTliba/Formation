package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysEvent {

	public static void main(String[] args) {
		//chemin Chrome
		
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				WebDriver driver;
				driver=new ChromeDriver();
				
				//maximaze window
				
				driver.manage().window().maximize();
				
				//delete cookies
				
				driver.manage().deleteAllCookies();
				
				//implicity wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				//ouverture URL
				
				driver.navigate().to("https://demoqa.com/text-box");
				
				//
				
				WebElement currentadress;
				currentadress=driver.findElement(By.id("currentAddress"));
			
				WebElement permanentadress;
				permanentadress=driver.findElement(By.id("permanentAddress"));
				
				Actions action =new Actions(driver);
				
				currentadress.sendKeys("200 avenue de la liberté tunis");
				
				action.keyDown(currentadress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(permanentadress, Keys.CONTROL).perform();
				action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				
				
	}

}
