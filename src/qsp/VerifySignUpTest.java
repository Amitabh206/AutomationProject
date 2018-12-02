package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FBSignUpPage su= new FBSignUpPage(driver);
		su.enterFName("Amitabh");
		su.enterLName("Sinha");
		su.enterEmail("Amitabhsinha17@gmail.com");
		su.enterMailConf("Amitabhsinha17@gmail.com");
		su.enterPassW("amitabh77");
		su.enterDay("28");
		su.enterMonth("11");
		su.enterYear("1995");
		su.sex();
		su.signUp();	

	}

}
