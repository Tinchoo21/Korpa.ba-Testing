package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.KorpaMainPage;
import pages.RegistrationPage;

public class Regression_Test_2 {

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
		RegistrationPage.emailInputField(driver).sendKeys("123test.com");
		RegistrationPage.phoneNumInputField(driver).sendKeys("062345567");
		RegistrationPage.passwordInputField(driver).sendKeys("testing123");
	}
	
	public static void clickingRegistrateButton()
	{
		RegistrationPage.registrateButton(driver).click();
	}
}
