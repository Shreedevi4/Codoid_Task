package codoid.selenium.task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Write code for handling multiple windows
public class Task1 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workout\\Selenium\\Browser Extract\\"
				+ "chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get( "https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone",Keys.ENTER);
		WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[1]"));
		iphone.click();
	
		Set<String> allWindowId = driver.getWindowHandles();
		for (String allId : allWindowId) {
			if (!allId.equals(allWindowId)) {
				driver.switchTo().window(allId);
			}
		}

		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[5]"));
		String priceStr = price.getText();
		System.out.println(priceStr);
	}
}
