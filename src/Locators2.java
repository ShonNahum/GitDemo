import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Locators2 {
	static String expectedList[] = {"3","27","2024"};
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions(); //help set behaviorof chrome browers
		
		options.setAcceptInsecureCerts(true);// the behavor now make so it will bypass the ןאחיבור שלך לא פרטי
		//when we open driver.get we get it without any extentions (like adblock (plugins)) so we can add V
//		options.addExtensions(//need to put the path  of file with plguin)
	
		//if need special porxy to access the browser
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("ipadress:4444"); //"string ip address and port nubmer"
//		options.setCapability("proxy", proxy);//capability is custom config for ChromeDriver (like proxy)
		WebDriver driver = new ChromeDriver(options);//giving ChromeDriver the knowledge of how to invoke the browser with this behavior
		driver.get("https://expired.badssl.com/"); // handle "החיבור שלך לא פרטי"
		//NEVER TRY TO automatic stuff like that by click advance and continue..
		//we have method to handle bad ssl connection (Privacy error)
		 
		System.out.println(driver.getTitle());
	
		//to block Pop-up windows
		//ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popupblocking"));
	}
} 