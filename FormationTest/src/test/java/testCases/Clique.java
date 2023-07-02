package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Clique {

	public static void main(String[] args) throws InterruptedException {
		// chemin chrome
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		
		//maximaze window
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://demoqa.com/buttons");
		Thread.sleep(5000);
		
		//
		WebElement ClickMe;
		ClickMe=driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		
		//action click
		Actions action =new Actions(driver);
		
		action.click(ClickMe).perform();
		
		
		//verification
		WebElement message;
		message=driver.findElement(By.id("dynamicClickMessage"));
		String texte;
		texte=message.getText();
		Assert.assertEquals(texte, "You have done a dynamic click");
		System.out.println("Dynamic click done");
		
		
		
		
		
		
		
		

	}

}
