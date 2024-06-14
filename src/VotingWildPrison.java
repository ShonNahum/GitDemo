import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VotingWildPrison {

	public static void main(String[] args) throws InterruptedException {
		String username = "ShonTM";
		WebDriver driver = new ChromeDriver();
		//1
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://top-minecraft-servers.net/server/WildPrison/vote");
		driver.findElement(By.id("username")).sendKeys(username);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		
		//3.
		openNewWindow(driver, "https://minecraft-server-list.com/server/442408/vote/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ignn")));

		driver.findElement(By.name("ignn"));
        inputElement.sendKeys(username);
//		Thread.sleep(2000);
//		driver.findElement(By.id("voteButton")).click();
	
		Thread.sleep(10000);

		
		//2.
		openNewWindow(driver,"https://best-minecraft-servers.co/server-wildprison.1330/vote");
		driver.findElement(By.name("username")).sendKeys(username);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='voteSubmit']")).click();


	}
	
    public static void openNewWindow(WebDriver driver, String url) {
        // Execute JavaScript to open new window
        ((JavascriptExecutor) driver).executeScript("window.open(arguments[0], '_blank');", url);
    }

}
