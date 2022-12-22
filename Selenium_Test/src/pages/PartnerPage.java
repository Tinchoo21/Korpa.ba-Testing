package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PartnerPage {
	
	static WebElement element = null;
	
	
	
	public static WebElement KrofnaItem(WebDriver driver) {
		
		 element = driver.findElement(By.xpath("//*[@id=\"food_add_256877\"]"));
		return element;
	}
	public static WebElement itemsBrowse(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"food_list\"]/li[2]/a"));
		return element;
	}
	public static WebElement checkoutBtn(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'nakasu\']"));
		return element;
	}
	public static WebElement decrementItemFromCart(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"food_minus_256877\"]"));
		return element;
	}
	public static WebElement incrementItemFromCart(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"food_plus_256877\"]"));
		
		return element;
		
	}
	
	public static WebElement CocaColaItem(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"food_add_256859\"]"));
		return element;
	}
	public static WebElement clickingDodaciItem(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"addCustomizedProduct\"]"));
		return element;
	}
	public static WebElement addingAnotherCocaCola(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"food_plus_256859\"]"));
		return element;
	}
	public static WebElement selecting500mlCocaCola(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"size_256859_97\"]"));
		return element;
	}

	

}
