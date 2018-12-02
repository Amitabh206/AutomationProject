package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		Thread.sleep(1000);
//		cd.close();
		cd.quit();
	}

}
