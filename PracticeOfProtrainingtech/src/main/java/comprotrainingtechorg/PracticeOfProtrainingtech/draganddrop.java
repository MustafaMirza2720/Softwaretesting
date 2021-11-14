package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class draganddrop {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebDriverWait ok=new WebDriverWait(driver, 10);
		driver.switchTo().frame(0);
		ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
		ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
		WebElement dragtoelement=driver.findElement(By.id("draggable"));
		WebElement droptoelement=driver.findElement(By.id("droppable"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(dragtoelement, droptoelement).build().perform();
		driver.switchTo().parentFrame();
		
		

	}

}
