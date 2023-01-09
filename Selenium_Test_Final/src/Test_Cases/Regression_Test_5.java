package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.KorpaMainPage;
import Pages.LoginPage;



public class Regression_Test_5 {

	
	static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		
		mainToPrijaviSe();
		Thread.sleep(2000);
		loginInputForm();
		clickingLoginButton();

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
		
		
		LoginPage.emailInputField(driver).sendKeys("testtestic@gmail.com");
		
		if(LoginPage.emailInputField(driver).getAttribute("value").equals("testtestic@gmail.com"))
		{
			System.out.println("3)Validation - We inputed correct email (testtestic@gmail.com) - ✓");
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
			System.out.println("6)Validation - We loged in successfully - ✓");
		}
		else
		{
			System.out.println("6)Validation - Error , login was not successful- X");
		}
	}

	
}