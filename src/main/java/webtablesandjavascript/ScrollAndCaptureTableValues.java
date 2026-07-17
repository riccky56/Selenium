package webtablesandjavascript;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollAndCaptureTableValues {
	public static WebDriver driver;

	public static void main(String[] args) {

		Set<String> capturedValues = new LinkedHashSet<>(); // preserves order, avoids duplicates
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollContainer = driver.findElement(By.cssSelector(".scroolcontainerlocator"));

		int unchangedCountLimit = 3; // stop after N consecutive scrolls with no new data
		int unchangedCount = 0;

		while (unchangedCount < unchangedCountLimit) {

			int beforeSize = capturedValues.size();
			// 1. Capture whatever is currently rendered
			List<WebElement> visibleRows = driver.findElements(By.cssSelector(".rowLocator"));
			for (WebElement row : visibleRows) {
				String value = row.getText().trim();
				if (!value.isEmpty()) {

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
			for (WebElement row : afterScrollRows) {
				String value = row.getText().trim();
				if (!value.isEmpty()) {
					capturedValues.add(value);
				}
			}

			int afterSize = capturedValues.size();

			if (afterSize == beforeSize) {
				unchangedCount++;
			} else {
				unchangedCount = 0; // reset since we got new data
			}
		}

		return;
	}

}
