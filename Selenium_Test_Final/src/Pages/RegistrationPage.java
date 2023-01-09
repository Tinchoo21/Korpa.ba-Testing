package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	

	static WebElement element = null;
	
	public static WebElement imeInputField(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\'inputFullName\']"));
		return element;
	}
	public static WebElement emailInputField(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]"));
		return element;
	}
	public static WebElement phoneNumInputField(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"inputPhone\"]"));
		return element;
	}
	public static WebElement passwordInputField(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"inputPassword\"]"));
		return element;
	}
	
	public static WebElement registrateButton(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"target\"]/button"));
		return element;
	}
	
	
	
}


