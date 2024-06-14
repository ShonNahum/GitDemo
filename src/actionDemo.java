import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;

public class actionDemo {

	public static void main(String[] args) throws IOException {
//handle broken links
		WebDriver driver = new ChromeDriver();
	//when we click on link and it thorow any error (broken link == broken URL) (link that not working) (page not found)
	//F12 and go to Network and when u click u can see status of the website load (200 = Ok) = any number greater then 400 = URL BROKEN
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		WebElement links = driver.findElement(By.id("gf-BIG"));
	//	System.out.println(links.findElements(By.xpath("//a"))size());
	//java method call URLS and get their the status code 
//		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href"); // give me the value attritbute of href = link URL
//	
//		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection(); // openConnection is java class thing
//		//calling openconnection method that present in url class so thats why we create object and calling with . (dot)
//		//the return type of the methof is httpurlconnection so we call this method and we casting it 
//		conn.setRequestMethod("HEAD");//we using head request method
//		conn.connect();
//		int responseCon = conn.getResponseCode();
//	System.out.println(responseCon);
	SoftAssert a = new SoftAssert();
	List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	 for(WebElement link : links) {
		String url = link.getAttribute("href");
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection(); // openConnection is java class thing
		conn.setRequestMethod("HEAD");//we using head request method
		conn.connect();	
		int responseCon = conn.getResponseCode();
		System.out.println(responseCon);
		//		if(responseCon>400) {
//			System.out.println(link.getText() + " is broken with code " + responseCon);
//		//	Assert.assertTrue(false); // thats hard assert, stop the script immidiatly
//			//need to use soft assertion that will continue the script in TestNG
//		}
		a.assertTrue(responseCon<400," the link " + link.getText() + " is broken with code " + responseCon);
	 }
	a.assertAll();//when a.assertTrue store the fails, this command will stop the script, if there is no store fail links store, it will continue the script
	} 
	

}
