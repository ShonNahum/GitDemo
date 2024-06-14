import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		//Drag something and drop it somewhere
		//frames is component that hosted in webpages and cointain it as container
		//Selinum cant idetify the frames in normal fashion, we need to tell selinum that its farmes
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.xpath("//a")).size()); // or by.tagname("a")
		
		WebElement miniAreaInPage = driver.findElement(By.id("gf-BIG")); // limit  webdriver scope (page)
		System.out.println(miniAreaInPage.findElements(By.xpath("//li")).size()); //its how to see links in specific area
		 		
		WebElement DiscountCopounsColuumsInsideMinPage = miniAreaInPage.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // its how to navigate to the right identify
		System.out.println(DiscountCopounsColuumsInsideMinPage.findElements(By.tagName("a")).size()); 	 // inside the spefiic area i want to see only 1 coluum of links.
		int LinkNum = DiscountCopounsColuumsInsideMinPage.findElements(By.tagName("a")).size();
		for(int i=0;i<LinkNum;i++) {//for loop to open all the links
			String CONTROL = Keys.chord(Keys.CONTROL,Keys.ENTER);//this combination  let u know to click on any link that will open everything in every tab 
			DiscountCopounsColuumsInsideMinPage.findElements(By.tagName("a")).get(i).sendKeys(CONTROL); // (the enter same like the click() 
			Thread.sleep(5000L);
		}
			Set<String> tabs = driver.getWindowHandles();
			Iterator<String>it = tabs.iterator();
			//we not using while loop in the for loop because if it false it will fail the test 
			while(it.hasNext()) { //its present if the next index present (next tab(child))
				driver.switchTo().window(it.next()); // to skip the  tabs	
			System.out.println(driver.getTitle());	
			}
		

		}
	}


