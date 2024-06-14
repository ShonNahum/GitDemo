import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Activitys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//handle AutoSuggestive (text that if i write for example I , it suggest me iran, israel)
		driver.findElement(By.id("autosuggest")).sendKeys("ind"); // put ind in text box
		Thread.sleep(3000);
		//because it dissapeared so i click and inspect the india option
		// li[class='ui-menu-item'] a    its CSS generic (give the 3 items = 3 elements locators)
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	// i import list and webelment library and use FindElements not FindElement
		// with this we can catch all options into one variable
		
		for(WebElement option : options) { //pick one option (one Webelement from the Option (Webelement list that have all list inside))
			System.out.println(option.getText()); // it print british , inside , indonesia
			if(option.getText().equalsIgnoreCase("India")){ //if in options list there is "India" so TRUE (equalsIgnoreCase is boolean) and it will go inside the if
				option.click(); //will click in the india
				break; // stop the loop
			}
			}
		}	
	}
// ****REMEMEMBER doing generic thing in autosuggestion******

// we can use WebElemet Sourse = driver.findElement(By.id("hp-widget__sTo")); for example
//and do Sourse.sendKeys if its text box, Sourse.clear; etc.. its shorter
