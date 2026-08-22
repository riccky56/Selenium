package webtablesandjavascript;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Class declaration that groups the related example logic in one place.
public class ScrollAndCaptureTableValues {
	public static WebDriver driver;

	// Main method where program execution starts.
	public static void main(String[] args) {

		Set<String> capturedValues = new LinkedHashSet<>(); // preserves order, avoids duplicates
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollContainer = driver.findElement(By.cssSelector(".scroolcontainerlocator"));

		int unchangedCountLimit = 3; // stop after N consecutive scrolls with no new data
		// Initialize a variable that will be used in the logic.
		int unchangedCount = 0;

		// Continue looping while the given condition remains true.
		while (unchangedCount < unchangedCountLimit) {

			// Initialize a variable that will be used in the logic.
			int beforeSize = capturedValues.size();
			// 1. Capture whatever is currently rendered
			List<WebElement> visibleRows = driver.findElements(By.cssSelector(".rowLocator"));
			// Loop through each element one by one.
			for (WebElement row : visibleRows) {
				// Store text data that will be processed by the program logic.
				String value = row.getText().trim();
				// Check the condition before deciding whether this block should run.
				if (!value.isEmpty()) {

					// Add the current value into the collection.
					capturedValues.add(value);
				}
			}

			// 2. Scroll down within the container (not the page, if it's an inner scrollable div)
			js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + arguments[0].clientHeight;",
					scrollContainer);

			// 3. Wait for new rows to render (replace with explicit wait / fluent wait as needed)
			try {
				Thread.sleep(800); // swap for WebDriverWait on row count/staleness in real code
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			// 4. Capture again after scroll
			List<WebElement> afterScrollRows = driver.findElements(By.cssSelector(".rowLocator"));
			// Loop through each element one by one.
			for (WebElement row : afterScrollRows) {
				// Store text data that will be processed by the program logic.
				String value = row.getText().trim();
				// Check the condition before deciding whether this block should run.
				if (!value.isEmpty()) {
					// Add the current value into the collection.
					capturedValues.add(value);
				}
			}

			// Initialize a variable that will be used in the logic.
			int afterSize = capturedValues.size();

			// Check the condition before deciding whether this block should run.
			if (afterSize == beforeSize) {
				unchangedCount++;
			} else {
				unchangedCount = 0; // reset since we got new data
			}
		}

		// Return the final result back to the caller.
		return;
	}

}
