package codoid.selenium.task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2 {
//	Write code for positive and negative scenarios for Alerts
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workout\\Selenium\\Browser Extract\\"
				+ "chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html" );
		WebElement alertBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alertBtn.click();
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btn.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Yes");
		a.accept();
		Thread.sleep(3000);
		
		WebElement alertBtn2 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		alertBtn2.click();
		WebElement alrt = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		alrt.click();
		a.dismiss();
		
//		driver.quit();
		
		
	}
}
