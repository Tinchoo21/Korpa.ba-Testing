package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class KorpaMainPage {

	
	
	static WebElement element = null;
	
	public static WebElement Registruj_se_Button(WebDriver driver) {
		
		 element = driver.findElement(By.linkText("Registruj se"));
		return element;
	}
	
	public static WebElement Prijavi_se_Button(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"mylocationform\"]/div/div/div[2]/a"));
		return element;
	}
	
	public static WebElement ItemFromMostPopularCategory(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[28]/div/div/a"));
		 
		
		return element;
	}
	public static WebElement ItemFromNewCategory(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"tab-Sarajevo\"]/section[2]/div/div[3]/div/div/div[1]/div/div[9]/div/div/div[2]/div/h6/a"));
		return element;
	}
	public static WebElement profile(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[3]/a"));
		return element; 
	}
	
	

}
