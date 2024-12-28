package org.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	
	
	static void institutemail() {
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\training\\Zepp\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://zepp.studentpurchaseprogram.com/");
		
		// Entering correct email id & clicking the "send login button"
		driver.findElement(By.xpath("//input[@id='home_email']")).sendKeys("meckavi@gmail.com",Keys.ENTER);
		
		driver.navigate().refresh();
		
		// Clicking the "Send Login button" without entering the email id  
		
		driver.findElement(By.xpath("//input[@id='home_email']")).sendKeys("",Keys.ENTER);
		
		driver.navigate().refresh();
		
		//Entering invalid email id & clicking the "send login button"
		driver.findElement(By.xpath("//input[@id='home_email']")).sendKeys("mecka",Keys.ENTER);		
		
		
	}
	
	static void mobilenumber() {
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\training\\Zepp\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
		driver.get("https://zepp.studentpurchaseprogram.com/");
		
		driver.findElement(By.xpath("(//input[@class='dont_have'])[1]")).click();
		
		// Entering valid phone number
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("7200750798",Keys.ENTER);
		
		driver.navigate().refresh();
		
		
		// Entering invalid phone number
		driver.findElement(By.xpath("(//input[@class='dont_have'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("uerr0750798",Keys.ENTER);
		
		// without entering the phone number
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//input[@class='dont_have'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("",Keys.ENTER);		
		
	}
	
	static void personalemail()  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\devl\\training\\Zepp\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
		driver.get("https://zepp.studentpurchaseprogram.com/");
		
		driver.findElement(By.xpath("(//input[@class='dont_have'])[2]")).click();
		
		// Entering correct email id & clicking the "send OTP button"
				driver.findElement(By.xpath("//input[@id='home_email']")).sendKeys("meckavi@gmail.com",Keys.ENTER);
				
				
				driver.navigate().refresh();
				
				// Clicking the "OTP button" without entering the email id  
				driver.findElement(By.xpath("(//input[@class='dont_have'])[2]")).click();
				
				
				driver.findElement(By.xpath("//input[@id='home_email']")).sendKeys("",Keys.ENTER);
				
				
				driver.navigate().refresh();
				
				//Entering invalid email id & clicking the "send OTP button"
				driver.findElement(By.xpath("(//input[@class='dont_have'])[2]")).click();
				
				driver.findElement(By.xpath("//input[@id='home_email']")).sendKeys("mecka",Keys.ENTER);			
		
	}
		
	
	public static void main(String[] args) {
		institutemail();
		mobilenumber();
		personalemail();
		
		
	}

}
