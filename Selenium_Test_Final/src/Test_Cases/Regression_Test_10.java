package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CategoryPage;
import Pages.KorpaMainPage;
import Pages.LoginPage;
import Pages.PartnerPage;



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
				 if(driver.findElement(By.xpath("//*[@id=\"cart_design\"]/div[2]/div/div/p/small[1]")).getText().equals("500 ml"))
					{
						System.out.println("10)Validation - Coca cola - 500ml was added successfully  - ✓");
					}
					else
					{
						System.out.println("10)Validation - Error , Coca cola - 500ml was not added - X");
					}
		
			
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
			if(driver.findElement(By.xpath("//*[@id=\"cart_design\"]/div[1]/div/div/p/small[1]")).getText().equals("400 ml"))
			{
				System.out.println("9)Validation - Coca cola - 400ml was added successfully  - ✓");
			}
			else
			{
				System.out.println("9)Validation - Error , Coca cola - 400ml was not added - X");
			}
			PartnerPage.addingAnotherCocaCola(driver).click();
		}
		public static void selecting500ml()
		{
			PartnerPage.selecting500mlCocaCola(driver).click();
		}
		

}