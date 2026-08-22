package webtablesandjavascript;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Demonstrates how to scroll through a container and collect table or row values without duplicates.
public class ScrollAndCaptureTableValues {
	public static WebDriver driver;

	// Capture the visible rows, scroll the container, and keep collecting values until no new data appears.
	public static void main(String[] args) {

		// Store captured text values in insertion order while automatically removing duplicates.
		Set<String> capturedValues = new LinkedHashSet<>();
		// Use JavaScript so the code can scroll inside the target container.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Locate the inner scrollable container that holds the rows.
		WebElement scrollContainer = driver.findElement(By.cssSelector(".scroolcontainerlocator"));

		// Stop after several scroll attempts fail to reveal any new values.
		int unchangedCountLimit = 3;
		// Count how many consecutive scroll attempts produced no additional values.
		int unchangedCount = 0;

		// Keep scrolling until the script appears to have reached the end of the available data.
		while (unchangedCount < unchangedCountLimit) {

			// Record the current number of unique values before another capture pass.
			int beforeSize = capturedValues.size();
			// Read the rows that are currently visible inside the scrollable region.
			List<WebElement> visibleRows = driver.findElements(By.cssSelector(".rowLocator"));
			// Add each non-empty row value to the result set.
			for (WebElement row : visibleRows) {
				// Clean the row text before storing it.
				String value = row.getText().trim();
				// Ignore blank rows and store only real visible values.
				if (!value.isEmpty()) {

					capturedValues.add(value);
				}
			}

			// Scroll down inside the container by one visible container height.
			js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + arguments[0].clientHeight;",
					scrollContainer);

			// Pause briefly to allow newly exposed rows to render.
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			// Capture the set of rows visible after scrolling.
			List<WebElement> afterScrollRows = driver.findElements(By.cssSelector(".rowLocator"));
			// Add any newly revealed non-empty row values.
			for (WebElement row : afterScrollRows) {
				// Clean the row text before storing it.
				String value = row.getText().trim();
				// Ignore blank entries and keep only useful row text.
				if (!value.isEmpty()) {
					capturedValues.add(value);
				}
			}

			// Measure the number of unique values after the second capture pass.
			int afterSize = capturedValues.size();

			// Increase the unchanged counter when scrolling produced no new values.
			if (afterSize == beforeSize) {
				unchangedCount++;
			} else {
				// Reset the counter because new data was found.
				unchangedCount = 0;
			}
		}

		// End the demo after the capture loop finishes.
		return;
	}

}
