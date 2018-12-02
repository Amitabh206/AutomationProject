package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		String key="webdriver.gecko.driver";
//		String value=".\\drivers\\geckodriver.exe";//we can use '/' also
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		FirefoxDriver f= new FirefoxDriver();
		Thread.sleep(1000);
		f.close();

	}

}
