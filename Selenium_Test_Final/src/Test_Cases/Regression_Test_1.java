package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.KorpaMainPage;
import Pages.LoginPage;
import Pages.RegistrationPage;


public class  Regression_Test_1 {
	
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		
		
		
		fromMainToRegisterPage();
		inputingRegistrationForm();
		clickingRegistrateButton();
		
	}
	
	
	public  static void fromMainToRegisterPage()
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
		LoginPage.clickRegBtn(driver).click();
		
		if(driver.getCurrentUrl().equals("https://korpa.ba/registracija"))
		{
			System.out.println("2)Validation - We landed on right page (Korpa Registration page) - ✓");
		}
		else
		{
			System.out.println("2)Validation - Error , page is not correct - X");
		}
		
	}
	
	public static void inputingRegistrationForm()
	{
		
		RegistrationPage.imeInputField(driver).sendKeys("@@@");
		if(RegistrationPage.imeInputField(driver).getAttribute("value").equals("@@@"))
		{
			System.out.println("3)Validation - We inputed correct name (@@@) - ✓");
		}
		else
		{
			System.out.println("3)Validation - Error , name input is not correct - X");
		}
		RegistrationPage.emailInputField(driver).sendKeys("adam123@gmail.com");
		if(RegistrationPage.emailInputField(driver).getAttribute("value").equals("adam123@gmail.com"))
		{
			System.out.println("4)Validation - We inputed correct email (adam123@gmail.com) - ✓");
		}
		else
		{
			System.out.println("4)Validation - Error , email input is not correct - X");
		}
		RegistrationPage.phoneNumInputField(driver).sendKeys("062225883");
		if(RegistrationPage.phoneNumInputField(driver).getAttribute("value").equals("062225883"))
		{
			System.out.println("5)Validation - We inputed correct phone number (062225883) -✓");
		}
		else
		{
			System.out.println("5)Validation - Error , phone number input is not correct - X");
		}
		RegistrationPage.passwordInputField(driver).sendKeys("Test123");
		if(RegistrationPage.passwordInputField(driver).getAttribute("value").equals("Test123"))
		{
			System.out.println("6)Validation - We inputed correct password (Test123) - ✓");
		}
		else
		{
			System.out.println("6)Validation - Error , password input is not correct - X");
		}
	}
	
	public static void clickingRegistrateButton()
	{
		RegistrationPage.registrateButton(driver).click();
	}

}
