package codoid.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
//	Write code for handling Frames
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workout\\Selenium\\Browser Extract\\"
				+ "chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(frame1);
		
	}
	
}
