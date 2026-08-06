package pages;
import org.openqa.selenium.*;
public class ElementPage {

	WebDriver driver;
	
	By inputBox=By.id("input_text");

	public ElementPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getInputBox()
	{
		return driver.findElement(inputBox);
	}
}
