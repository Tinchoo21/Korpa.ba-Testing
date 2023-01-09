package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {
	
	
	static WebElement element = null;
	
	public static WebElement KFCShop(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"kategorije_lista\"]/div[2]/div/div/div[2]/div/h6/a"));
		return element;
	}

}
