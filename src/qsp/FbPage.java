package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FbPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		//login
//	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("amitabhsinha.sinha@yahoo.co.in");
	
//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("amitabh206");
	
//		driver.findElement(By.cssSelector("input[value='Log In']")).click();
//		driver.navigate().back();
//		
//		//signUP
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Amitabh");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Sinha");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("amitabhsinha17@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("amitabh777");
		driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("amitabhsinha17@gmail.com");
		driver.findElement(By.cssSelector("input[id='u_0_a']")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		Select sel=new Select(day);
		sel.selectByVisibleText("28");
		
		WebElement month=driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByValue("11");
		
		WebElement year=driver.findElement(By.id("year"));
		Select sel2=new Select(year);
		sel2.selectByValue("1995");

		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
