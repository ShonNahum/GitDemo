import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("0503693991"); //i finding the text box email by click on f12 and the arrow and i saw that the text box for email his id is "email" so i used .sendKeys("shon") to put my name there.
		driver.findElement(By.name("pass")).sendKeys("Shonking123");//i find in inspect by name, not id
	//in selenium we have option to use if its have class. 
		driver.findElement(By.name("login")).click(); // so the automation will click on it
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //because our computer not fast, untill the server send us the error msg, its not immiditaly so this command says, dont crash the code, wait 5 seconds and parallel in the 5 second if the error will appear it will continue the code
//	System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText()); // i print to the console by <div class="_9ay7"> the msg error
//
//		//if in class there is Space. for example: class="Sumbit SigninBtm" its means there is two class defined for the button but u can use one of them for use the button both of them uniqe to the button
//		// its not like two class, its like one class contains 2 sections.
//		
//		
//		// if we have error messange, we want to capture it and print it on the console.
//	
//	//to find sometinhg by id, u have to have that id in html code!
//		//Xpath and CSS Selector - need to build from the given html code need to construct them! 
//		
//		//CSS selector -
//		
////	Class name -> tagname.classname (its css selector)
////	
////		//<input type="text" placeholder="Username" id="inputUsername"value=">
////	with this build we can do
////		input[placeholdrer="Username"]
////
////				//if u choose something  u think he is uniqe but its not, selemium will choose the first one. so check out and do only uniqe!
////				//to make sure we not using thing twice we have in inspect 2 dev tools when u clikc on >> (ChroPath and SelectorsHub
////				//if website dont support selectorhub or chropath we can go to inspect -> console and type in the button for the css, we type syntax $('') like: $('div.__9ay7') andwe can expand and see how many elemnt is present
////				
////		id -> tagname#id ->  input#inputUsermame
////		
////		tagname[attribute='value'] if dont have id
////		// if we dont have id or classname we still can write xpath or css selector based on exiting thing available
//	//create ccs for the button class tagname.classsname -> button.signinBtn (signinBtm is the class name)
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //because our computer not fast, untill the server send us the error msg, its not immiditaly so this command says, dont crash the code, wait 5 seconds and parallel in the 5 second if the error will appear it will continue the code
//
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		driver.findElement(By.linkText("Forgotten password?")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //because our computer not fast, untill the server send us the error msg, its not immiditaly so this command says, dont crash the code, wait 5 seconds and parallel in the 5 second if the error will appear it will continue the code
//
//		driver.findElement(By.name("reset_action")).click();
//
//			 
//	//		(Xpath -	//Tagname[@attribute='value'] )
//				//For example in <input type="text" placeholder="Username" value=">
//				//we type   //input[@placeholder='Username']
//	//			//input[@placeholder="Email address or mobile number"]
//				// to make it CSS we dont need to remove the // and the @
//			//	driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("i forgot email too lol");
//
//		//lets do it with css
//		driver.findElement(By.cssSelector("input[aria-label='Email address or mobile number']")).sendKeys("again i forgot");
//		//driver.findElement(By.cssSelector("input[aria-label='Email address or mobile number']")).clear(); // clear the data inside
//	
//	
//	
//	//System.out.println(driver.findElement(By.cssSelector("form p")).GetText());
//
//		
//		//driver.findElement(By.cssSelector(".reset button")).click();
//		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("hi)
//		
		
	} 
	

}
