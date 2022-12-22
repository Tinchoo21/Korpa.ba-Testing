package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.KorpaMainPage;
import pages.RegistrationPage;

public class Smoke_Test_1 {
	
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		
		
		
		fromMainToRegisterPage();
		inputingRegistrationForm();
		clickingRegistrateButton();
		
	}
	
	
	public  static void fromMainToRegisterPage()
	{

		driver.get("https://korpa.ba/");
		KorpaMainPage.Registruj_se_Button(driver).click();
	}
	
	public static void inputingRegistrationForm()
	{
		
		RegistrationPage.imeInputField(driver).sendKeys("Adam");
		RegistrationPage.emailInputField(driver).sendKeys("adam123@gmail.com");
		RegistrationPage.phoneNumInputField(driver).sendKeys("062225883");
		RegistrationPage.passwordInputField(driver).sendKeys("Test123");
	}
	
	public static void clickingRegistrateButton()
	{
		RegistrationPage.registrateButton(driver).click();
	}

}
