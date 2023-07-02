package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

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
				driver.navigate().to("https://demoqa.com/menu");
				Thread.sleep(5000);
				
				//declaration et identification
				WebElement MainItem2;
				MainItem2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
				WebElement SubList;
				SubList=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
				
				//Action Double click
				
			    Actions action =new Actions(driver);
			    action.moveToElement(MainItem2).perform();
			    action.moveToElement(SubList).perform();

			    
                System.out.println("Test OK");
	}

}
