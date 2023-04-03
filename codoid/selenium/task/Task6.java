package codoid.selenium.task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task6 {
//	Select multiple options from the dropdown
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Greens Workout\\Selenium\\Browser Extract\\"
				+ "chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2" );
		WebElement ddnFruits = driver.findElement(By.id("fruits"));
		Select s = new Select(ddnFruits);
		s.selectByVisibleText("Orange");
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByIndex(0);
		
		System.out.println(s.getFirstSelectedOption().getText());
	}
}

