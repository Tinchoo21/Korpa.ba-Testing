package Test_Cases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CategoryPage;
import Pages.KorpaMainPage;
import Pages.LoginPage;
import Pages.PartnerPage;



public class Regression_Test_9 {

    static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		
		mainToPrijaviSe();
		loginInputForm();
		clickingLoginButton();
		Thread.sleep(1000L);
		clickingItemFromMostPopularCategory();
		clickingItemCategoryPage();
		selectingItemFromStore();
		Thread.sleep(2000L);
		incrementingItemFromCart();
		Thread.sleep(2000L);
		decrementingItemFromCart();
	
		
	}
	
	public static void mainToPrijaviSe()
	{
		driver.get("https://korpa.ba/");
		if((driver.getTitle().equals("Korpa"))&& (driver.getCurrentUrl().equals("https://korpa.ba/")))
		{
			System.out.println("1)Validation - We landed on right page (Korpa Main page) - ✓");
		}
		else
		{
			System.out.println("1)Validation - Error , page is not correct - X");
		}
		
		
		KorpaMainPage.Prijavi_se_Button(driver).click();
		if(driver.getCurrentUrl().equals("https://korpa.ba/loginemail"))
		{
			System.out.println("2)Validation - We landed on right page (Korpa Login page) - ✓");
		}
		else
		{
			System.out.println("2)Validation - Error , page is not correct - X");
		}
	
	}
	
	public static void loginInputForm() 
	{
		
		
		LoginPage.emailInputField(driver).sendKeys("testtestic512@gmail.com");
		
		if(LoginPage.emailInputField(driver).getAttribute("value").equals("testtestic512@gmail.com"))
		{
			System.out.println("3)Validation - We inputed correct email (testtestic512@gmail.com) - ✓");
		}
		else
		{
			System.out.println("3)Validation - Error , email input is not correct - X");
		}
		LoginPage.clickBtn(driver).click();
		if(driver.getCurrentUrl().equals("https://korpa.ba/login"))
		{
			System.out.println("4)Validation - We landed on right page (Korpa Full Login page) - ✓");
		}
		else
		{
			System.out.println("4)Validation - Error , page is not correct - X");
		}
		LoginPage.passwordInputField(driver).sendKeys("testtestic123$");
		if(LoginPage.passwordInputField(driver).getAttribute("value").equals("testtestic123$"))
		{
			System.out.println("5)Validation - We inputed correct password (testtestic123$) - ✓");
		}
		else
		{
			System.out.println("5)Validation - Error , password input is not correct - X");
		}
	}
	
	public static void clickingLoginButton()
	{
		LoginPage.loginButton(driver).click();
		
		if(driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul/li[3]/a")).getAttribute("href").equals("https://korpa.ba/mojakorpa"))
		{
			System.out.println("6)Validation - Login was successful  - ✓");
		}
		else
		{
			System.out.println("6)Validation - Error , login was not successful - X");
		}
	}

	
	public static void clickingItemFromMostPopularCategory()
	{
		KorpaMainPage.ItemFromMostPopularCategory(driver).click();
	if(driver.getCurrentUrl().equals("https://korpa.ba/kategorije/96"))
		{
			System.out.println("7)Validation - We landed on right page (Korpa Category page) - ✓");
		}
		else
		{
			System.out.println("7)Validation - Error , page is not correct - X");
		}
	
	}
	
	public static void clickingItemCategoryPage()
	{
		CategoryPage.KFCShop(driver).click();
		if(driver.getCurrentUrl().equals("https://korpa.ba/partner/kfc-scc"))
		{
			System.out.println("8)Validation - We landed on right page (Korpa Partner page) - ✓");
		}
		else
		{
			System.out.println("8)Validation - Error , page is not correct - X");
		}
	}
	public static void selectingItemFromStore()
	{
		PartnerPage.KrofnaItem(driver).click();
		
		if(driver.findElement(By.xpath("//*[@id=\"nakasu\"]")).getAttribute("href").equals("https://korpa.ba/nakasu"))
		{
			System.out.println("9)Validation - Item was added successfully  - ✓");
		}
		else
		{
			System.out.println("9)Validation - Error , item was not added - X");
		}

		
	}
	public static void incrementingItemFromCart()
	{
		PartnerPage.incrementItemFromCart(driver).click();
		if(driver.findElement(By.xpath("//*[@id=\"cart_design\"]/div/span/input")).getAttribute("value").equals("2"))
		{
			System.out.println("10)Validation - Item was incremented successfully  - ✓");
		}
		else
		{
			System.out.println("10)Validation - Error , item was not incremented - X");
		}
		
	}
	public static void decrementingItemFromCart()
	{
		PartnerPage.decrementItemFromCart(driver).click();
		if(driver.findElement(By.xpath("//*[@id=\"nakasu\"]")).getAttribute("href").equals("https://korpa.ba/nakasu"))
		{
			System.out.println("11)Validation - Item was deleted successfully - ✓");
		}
		else
		{
			System.out.println("11)Validation - Error , item was not deleted - X");
		}
	}
}