package codoid.selenium.task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {
//	How to perform download files using selenium?
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workout\\Selenium\\Browser Extract\\"
				+ "chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
	
	String baseUrl = "https://demo.guru99.com/test/yahoo.html";

    driver.get(baseUrl);
    WebElement downloadButton = driver.findElement(By
    .id("messenger-download"));
    String sourceLocation = downloadButton.getAttribute("href");
    String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

    try {
    Process exec = Runtime.getRuntime().exec(wget_command);
    int exitVal = exec.waitFor();
    System.out.println("Exit value: " + exitVal);
    } catch (InterruptedException | IOException ex) {
    System.out.println(ex.toString());
    }
    
    }
}
