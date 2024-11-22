package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpeningFlipkart {

	
	@BeforeTest
	void init() {
		
		System.out.println("before test executed now");
		
	}
	@Test
	void login() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.onSpinWait();
		
	}
	@Test
	void login4() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.onSpinWait();
		
	}
	@Test
	void login2() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.onSpinWait();
		
	}
	@AfterTest
	void close() {
		
		System.out.println("after test executed now");
		

}}
