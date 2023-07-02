package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		//// chemin chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		//ouverture chrome
		WebDriver driver;
		driver=new ChromeDriver();
		
		//maximaze window
		driver.manage().window().maximize();
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//ouverture URL
		driver.navigate().to("https://fr-fr.facebook.com/");
		Thread.sleep(5000);
	
		//declaration et identification
		WebElement creernouveaucompte;
		creernouveaucompte=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		Actions action=new Actions(driver);
		action.click(creernouveaucompte).perform();
		Thread.sleep(5000);
		
		WebElement prenom;
		prenom=driver.findElement(By.name("firstname"));
		
		
		WebElement Nom;
		Nom=driver.findElement(By.name("lastname"));
		
		
		WebElement email;
		email=driver.findElement(By.name("reg_email__"));
		
		WebElement confirmationemail;
		confirmationemail=driver.findElement(By.name("reg_email_confirmation__"));
		
		WebElement Nvmotdepasse;
		Nvmotdepasse=driver.findElement(By.name("reg_passwd__"));
		
		
		WebElement jour;
		jour=driver.findElement(By.name("birthday_day"));
		
		
		
		WebElement mois;
		mois=driver.findElement(By.name("birthday_month"));
		
		
		WebElement annee;
		annee=driver.findElement(By.name("birthday_year"));
		
		
		WebElement femme;
		femme=driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		
		
		WebElement sincricre;
		sincricre=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		// action
		
		prenom.sendKeys("Sabrine");
		Nom.sendKeys("Tliba");
		email.sendKeys("sabrinetliba40@gmail.com");
		action.keyDown(email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(confirmationemail, Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		Nvmotdepasse.sendKeys("koussi");
		Select select=new Select(jour);
		select.selectByValue("15");
		Select select1=new Select(mois);
		select1.selectByValue("2");
		Select select2=new Select(annee);
		select2.selectByValue("1993");
		femme.click();
		sincricre.click();
		
		
		
		
		
		
		
		
		
		

	}

}
