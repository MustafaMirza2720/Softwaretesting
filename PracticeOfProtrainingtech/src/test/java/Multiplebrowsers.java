import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Multiplebrowsers {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() throws IOException, InterruptedException {
	  browser("chrome");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
	//	driver=new FirefoxDriver();
	//	System.setProperty("webdriver.edge.driver",  "C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\msedgedriver.exe");
	//	driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
	File Shotsof=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(Shotsof, new File("C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\pictures//amazon.png"));
	Thread.sleep(6000);
	driver.quit();
	
  }

  @AfterClass
  public void afterClass() {
  }
  public void browser(String nameofbrowser) {
	  if(nameofbrowser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				
	  }else if(nameofbrowser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				
	  }else if(nameofbrowser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver",  "C:\\Users\\musta\\eclipse-workspace\\PracticeOfProtrainingtech\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		  
		  
		  
	  }
	  
  }

}
