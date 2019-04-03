package one.one;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class chromedrive {

	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement login;
	@FindBy(id = "passwd")
	WebElement passwd;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement submit;
	
	
	//public chromedrive() {}
	
	@Test
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 PageFactory.initElements(driver, this);
		 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		// WebElement login = driver.findElement(By.id("email"));
		 login.sendKeys("abc@xddyz.com");
		 //WebElement passwd = driver.findElement(By.id("passwd"));
		 passwd.sendKeys("Indiagzgg");
		 Thread.sleep(3000);
		 //WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		 Actions a1 = new Actions(driver);
		 
		 a1.moveToElement(submit).perform();
		 
		 submit.click();
	}
	
			 
	}
     

