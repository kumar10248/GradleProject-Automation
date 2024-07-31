import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class App{

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "/Users/pradeepsahu/Desktop/selenium\ WebDriver\ Jars/chromedriver-mac-arm64/chromedriver");
		
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("indiabix",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		// js.executeScript("windows.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div[9]/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btnTheme\"]/i")).click();
		js.executeScript("window.scrollBy(0,350)", "");
		Thread t = new Thread();
		Thread.sleep(5000);
		driver.close();
//		driver.quit();

	}

}