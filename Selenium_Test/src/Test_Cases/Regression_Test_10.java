package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CategoryPage;
import pages.KorpaMainPage;
import pages.LoginPage;
import pages.PartnerPage;

public class Regression_Test_10 {
	
	  static WebDriver driver = new ChromeDriver();
		
		public static void main(String[] args) throws InterruptedException {
			
			mainToPrijaviSe();
			loginInputForm();
			clickingLoginButton();
			Thread.sleep(1000L);
			clickingItemFromMostPopularCategory();
			clickingItemCategoryPage();
			Thread.sleep(1000L);
			selectingColaItem();
			Thread.sleep(1000L);
			 clickingDodaciAddButon();
				Thread.sleep(1000L);
				addingAnotherItem();
				Thread.sleep(1000L);
				selecting500ml();
				Thread.sleep(1000L);
				 clickingDodaciAddButon();
		
			
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
		public static void selectingColaItem()
		{
			PartnerPage.CocaColaItem(driver).click();
		}
		public static void clickingDodaciAddButon()
		{
			PartnerPage.clickingDodaciItem(driver).click();
		}
		public static void addingAnotherItem()
		{
			PartnerPage.addingAnotherCocaCola(driver).click();
		}
		public static void selecting500ml()
		{
			PartnerPage.selecting500mlCocaCola(driver).click();
		}
		

}
