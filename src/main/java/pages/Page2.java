package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Page2 {
	WebDriver driver;
	String date="1-08-2026";
	@FindBy(id="input_text")
	WebElement inputBox;
	
	//@FindBy(xpath="//*[text()='"+date+"']")
	//WebElement dateBox;
	
	

	public Page2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getInputBox()
	{
		return (inputBox);
	}
}
