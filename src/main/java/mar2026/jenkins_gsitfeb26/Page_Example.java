package mar2026.jenkins_gsitfeb26;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import pages.*;
public class Page_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.findElement(By.id("input_text")).clear();
	//	driver.findElement(By.id("input_text")).sendKeys("hello");
		Page2 page=new Page2(driver);
		page.getInputBox().clear();
		page.getInputBox().sendKeys("hello");

	}

}
