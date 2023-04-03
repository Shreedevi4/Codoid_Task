package codoid.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
//	How to do file upload in Selenium?
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workout\\Selenium\\Browser Extract\\"
				+ "chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");

    WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

    // enter the file path onto the file-selection input field
    uploadElement.sendKeys("\"C:\\Users\\Shree Devi\\Desktop\\doc.pdf\"");

    // check the "I accept the terms of service" check box
    driver.findElement(By.id("terms")).click();

    // click the "UploadFile" button
    driver.findElement(By.name("send")).click();
    }
	}

