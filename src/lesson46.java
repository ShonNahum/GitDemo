import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lesson46 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// if there is tag called "select" , if any dropdown have select tag there is special class in selenium to handle select dropdowns (ברגע שתלחץ עליו יפתח כמה אופציות)
		// most of select dropdowns are static (perm variables)
		
		//dropdowns with select tag **STATIC** CANT CHANGE 
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); // we need to import WebElement Too.
		Select dropdown = new Select(staticDropDown); // imoprt the Select package
		//because the staticDropDown, now the Select dropdown know where the dropdown is present
		//and because we create dropdown as object we can use alot of method on him in select class
		System.out.println(dropdown.getFirstSelectedOption().getText());// its web element	 		
		dropdown.selectByIndex(3); // select option by index
		System.out.println(dropdown.getFirstSelectedOption().getText());// its web element	 		
		dropdown.selectByVisibleText("AED");//select option by visible text
		System.out.println(dropdown.getFirstSelectedOption().getText());// its web element	
		dropdown.selectByValue("USD");//see in the HTML what the "value"= is

		System.out.println(dropdown.getFirstSelectedOption().getText());// its web element	 		

// its handly when only the dropdowns have select tag!!
		 
		//how to hande if we dont have select tag, we will see it by later lecture
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//sibling and parent traverse. (in last lecture er travl from parent to child)
				//now we will tarvrse frrom sibling so sibling and child to parent (reverse)
				
				//we can start from root by type  /html/body/header (its from the start)
				// to jump to middle (relative xpath) we need to do double // and we'll start from middle and search for it like //header and its what most of people use
			// //header/div/button[1](this command is parent to child)will go to relative header and to his child div and to his child button (but we got 3 buttons there) so we want to go the first one so we so button[1]
				//because button have 3 elements (all 3 of them are sibling) if we want to from one sibling to other (becuase all 3 buttons are uniqe) 
				//we do  //header/div/button[1]/following-sibling::button[2] and we got the 2rd button and its how travel from sibling to sibling
				
			//	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).getText());
				//driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).click();
			
				
				
				
				//how to travel reverse from child to parent
				 //header/div/button[1]/parent::div
				//and grand parent is:  //header/div/button[1]/parent::div/parent::header
				
				//traveling back from child to parent is not possible in CSS !!!!!!
			}

}
