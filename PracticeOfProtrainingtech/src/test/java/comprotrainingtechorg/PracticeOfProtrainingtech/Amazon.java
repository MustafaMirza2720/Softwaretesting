package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Amazon {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebDriverWait ok=new WebDriverWait(driver, 10);
		driver.switchTo().frame(0);
		ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		WebElement dragtoelement=driver.findElement(By.id("draggable"));
		WebElement droptoelement=driver.findElement(By.id("droppable"));
		Thread.sleep(6000);
		Actions ob=new Actions(driver);
		ob.dragAndDrop(dragtoelement, droptoelement).build().perform();
		driver.switchTo().parentFrame();
		
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
