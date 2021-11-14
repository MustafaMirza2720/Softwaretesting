package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpass {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement create=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
		create.click();
		Thread.sleep(6000);
		WebElement Month=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(Month);
		ob.selectByIndex(3);
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select ob2=new Select(day);
		ob2.selectByValue("6");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ob6=new Select(year);
		ob6.selectByVisibleText("1996");
		
	

	}

}
