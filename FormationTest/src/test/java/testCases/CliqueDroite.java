package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CliqueDroite {

	public static void main(String[] args) throws InterruptedException {
		// chemin chromedriver
				System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
				//ouverture chrome
				WebDriver driver;
				driver=new ChromeDriver();
				
				//maximaze window
				driver.manage().window().maximize();
				
				//delete cookies
				driver.manage().deleteAllCookies();
				
				//ouverture URL
				driver.navigate().to("https://demoqa.com/buttons");
				Thread.sleep(5000);
				
				//declaration et identification
				WebElement Rightclick;
				Rightclick=driver.findElement(By.id("rightClickBtn"));
				
				//Action Double click
				
			    Actions action =new Actions(driver);
			    action.contextClick(Rightclick).perform();
			    
			    //verification
			    
			    WebElement message;
			    message=driver.findElement(By.id("rightClickMessage"));
			    
			    String texte;
			    texte=message.getText();
			    Assert.assertEquals(texte,"You have done a right click");
			    System.out.println("Right click done");

	}

}
