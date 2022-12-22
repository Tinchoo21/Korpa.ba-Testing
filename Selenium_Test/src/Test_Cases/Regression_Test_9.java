package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CategoryPage;
import pages.KorpaMainPage;
import pages.LoginPage;
import pages.PartnerPage;

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
		KorpaMainPage.Prijavi_se_Button(driver).click();
	}
	
	public static void loginInputForm()
	{
		LoginPage.emailInputField(driver).sendKeys("testtestic512@gmail.com");
		LoginPage.passwordInputField(driver).sendKeys("testtestic123$");
	}
	
	public static void clickingLoginButton()
	{
		LoginPage.loginButton(driver).click();
	}
	
	public static void clickingItemFromMostPopularCategory()
	{
		KorpaMainPage.ItemFromMostPopularCategory(driver).click();
	}
	
	public static void clickingItemCategoryPage()
	{
		CategoryPage.KFCShop(driver).click();
	}
	public static void selectingItemFromStore()
	{
		PartnerPage.KrofnaItem(driver).click();
		
	}
	public static void incrementingItemFromCart()
	{
		PartnerPage.incrementItemFromCart(driver).click();
	}
	public static void decrementingItemFromCart()
	{
		PartnerPage.decrementItemFromCart(driver).click();
	}
}
