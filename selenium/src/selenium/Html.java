package selenium;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Html {
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();	
	driver.get("http://www.google.com");
	WebElement element = driver.findElement(By.name( "q" ));
	// Enter something to search for
	element.sendKeys( "Cheese!" );
	// Now submit the form. WebDriver will find the form for us from the element
	element.submit();
	// Check the title of the page
	System.out.println( "Page title is: " + driver.getTitle());
	
	
}
}
