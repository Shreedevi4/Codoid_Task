package codoid.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
//	Automate Menu and Sub Menu and 
//	click on a link in Sub Menu and 
//	navigate to the page and click on an element
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver",
			"D:\\Greens Workout\\Selenium\\Browser Extract\\"
			+ "chromedriver_win32\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement menu = driver.findElement(By.xpath("(//span[text()='All'])[2]"));
	menu.click();
	WebElement subMenu = driver.findElement(By.xpath("(//a[text()='New Releases'])[2]"));
	subMenu.click();
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Boldfit Shoe Bag')]"));
	element.click();
	
	driver.quit();
	
	}
	
}
