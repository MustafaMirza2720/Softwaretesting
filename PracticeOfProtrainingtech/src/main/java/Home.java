import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;
	@FindBy(id = "twotabsearchbox") WebElement searchfieldclick;
	@FindBy(id = "nav-search-submit-button") WebElement searchbuttonclick;
	@FindBy(id = "Registry") WebElement Registry;
	
	public Home (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchfieldkeys() {
		searchfieldclick.sendKeys("computer");
		
	}
	
	public void searchbuttonclicking() {
		searchbuttonclick.click();
	}
	
	public void Registrybuttonclick() {
		Registry.click();
	}
	
}
	
		
	
			
				
				
		
		
	
