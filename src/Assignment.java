import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); // for explit wait
		String xpathReconizeDynamicUserName = "//p/b[i='rahulshettyacademy']";
		String xpathReconizeDynamicPassword = "//p/b[i='learning']";
		String xpathReconizeDynamicUserText= "//input[@name='username']";
		String xpathReconizeDynamicPasswordText= "//input[@name='password']";
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String dynamicUserName = driver.findElement(By.xpath(xpathReconizeDynamicUserName)).getText();
		String dynamicPassword = driver.findElement(By.xpath(xpathReconizeDynamicPassword)).getText();
		driver.findElement(By.xpath(xpathReconizeDynamicUserText)).sendKeys(dynamicUserName);
		driver.findElement(By.xpath(xpathReconizeDynamicPasswordText)).sendKeys(dynamicPassword);
		driver.findElement(By.xpath("//label[@class='customradio'][2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Thread.sleep(1000);
		WebElement staticDropDown = driver.findElement(By.xpath("//select[@data-style='btn-info']")); 
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
		String[] wantedItem = {"iphone X","Nokia Edge"};
		AddItem(driver, wantedItem);
		
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}


	public static void AddItem(WebDriver driver,String[] wantedItems) {
		List<String> listWantedItems = Arrays.asList(wantedItems);
		List <WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
		for(int i=0;i<products.size();i++) {
	
			String name = products.get(i).getText();

			System.out.println(products.get(i).getText());
			if(listWantedItems.contains(name)) {	
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			}
		}


	}
}
