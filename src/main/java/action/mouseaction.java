package action;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Demonstrates common mouse interactions such as hover, right-click, and double-click.
public class mouseaction {
	public static WebDriver driver;
	// Open the demo site, locate menu items, and perform advanced mouse actions on them.
	public static void main(String[] args) throws Exception {
		
		 driver = new ChromeDriver();
		
		// Open the demo storefront that contains menu items for mouse interaction.
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		// Maximize the browser to make the navigation menu fully visible.
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Locate the top-level Desktops menu and the Mac submenu entry.
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        
		// Create the Actions helper to build advanced mouse gestures.
		Actions act = new Actions(driver);
		// Hover over Desktops and then the Mac submenu item.
		act.moveToElement(desktop).moveToElement(mac).build().perform();
		
		// Open the context menu on the Mac submenu item.
		act.contextClick(mac);
		// Perform a double-click on the Desktops menu item.
		act.doubleClick(desktop);
	}

}
