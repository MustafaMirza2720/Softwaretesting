package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
static WebDriver driver;

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement PhoneNumberField=driver.findElement(By.name("email"));
		PhoneNumberField.sendKeys("MustafaMirza3030@gmail.com");
		WebElement PasswordField=driver.findElement(By.name("pass"));
		PasswordField.sendKeys("Ravens2720$");
		WebElement LinkText=driver.findElement(By.linkText("Forgot Password?"));
		Thread.sleep(6000);
		LinkText.click();
		WebElement Forgotpassword=driver.findElement(By.id("identify_email"));
		Forgotpassword.sendKeys("7036498166");
		LinkText.click();
		driver.navigate().refresh();
		WebElement submitbutton=driver.findElement(By.name("did_submit"));
		submitbutton.click();
		
		//input[@name='pass']
		//button[@name='login']
		
		
		

	}

}
