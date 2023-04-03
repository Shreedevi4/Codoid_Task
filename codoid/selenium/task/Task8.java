package codoid.selenium.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task8 {
//	Write code for taking Screenshot
	public static void main(String[] args) throws InterruptedException, IOException {
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
	driver.manage().window().maximize();
	TakesScreenshot tk = (TakesScreenshot)driver;
	File file = tk.getScreenshotAs(OutputType.FILE);
	File loc = new File("C:\\Users\\Shree Devi\\Desktop\\Codoid tasks\\Java Tasks\\screenshot.jpg");
	FileUtils.copyFile(file, loc);
	
	}
	
	
}
