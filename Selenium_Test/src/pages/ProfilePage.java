package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	
	static WebElement element = null;
	
	public static WebElement languageButton(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[5]/a"));
		return element;
	}
	
	public static WebElement switchToEnglishButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"myTabContent\"]/div/form/button"));
		return element;
	}

}
