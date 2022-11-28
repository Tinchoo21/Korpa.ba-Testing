package Test_Lab1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://korpa.ba/");
		
	/*	WebElement element =*/ driver.findElement(By.className("btn btn-outline-primary btn-block btn-login font-weight-bold mb-2")).click();
			
		/*WebElement reg1 =*/ driver.findElement(By.id("inputFullName"));
	
		
	}

}
