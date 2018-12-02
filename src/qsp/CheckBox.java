package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Amitabh/Desktop/cb.html");
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count=cb.size();
		System.out.println(count);
		
		//clicking
//		for(int i=0;i<count;i++){
//			WebElement cb1=cb.get(i);
//			cb1.click();
//			Thread.sleep(500);
//		}
		//clicking in reverse order
//		for(int i=count-1;i>0;i--){
//			WebElement cb1=cb.get(i);
//			cb1.click();
//			Thread.sleep(500);
//		}
		//clicking even checkboxes
//		for(int i=0;i<count;i++){
//			if(i%2==1){
//			WebElement cb1=cb.get(i);
//			cb1.click();
//			Thread.sleep(500);
//			}
//		}
		//clicking odd checkboxes
		for(int i=0;i<count;i++){
			if(i%2==0){
			WebElement cb1=cb.get(i);
			cb1.click();
			Thread.sleep(500);
			}
		}

	}

}
