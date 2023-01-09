package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	static WebElement element = null;
	
	
	
	public static WebElement emailInputField(WebDriver driver) {
		
		 element = driver.findElement(By.cssSelector("#inputEmail"));
		return element;
	}
	public static WebElement clickRegBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"target\"]/div[2]/a"));
		return element;
	}
	public static WebElement clickBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"target\"]/button"));
		return element;
	}
	public static WebElement passwordInputField(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"inputPassword\"]"));
		return element;
	}
	
	public static WebElement loginButton(WebDriver driver)
	{
		 element = driver.findElement(By.xpath("//*[@id=\"target\"]/button"));
			return element;
	}
}
