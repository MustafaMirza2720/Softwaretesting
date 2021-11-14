package comprotrainingtechorg.PracticeOfProtrainingtech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement simplealert=driver.findElement(By.name("alert"));
		simplealert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(6000);
		WebElement confirmationofalert=driver.findElement(By.name("confirmation"));
		confirmationofalert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(6000);
		confirmationofalert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		WebElement number3=driver.findElement(By.name("prompt"));
		number3.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().sendKeys("Lebron");
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		

	}

}
