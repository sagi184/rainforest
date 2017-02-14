package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screen {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		String baseUrl = "http://qa.phoenix.mathletics.com/default.aspx?username=DS-479263&password=pride05";
		driver.get(baseUrl);
	}

	@Test
	public void testStaticForm() throws IOException {
		
		

		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
	}
		/*float similarityPercentage = calculateImageSimilarity(
				"D:\\ScreenShot\\screenshot.png",
				"D:\\screenshot.png");
		
		Assert.assertTrue( similarityPercentage > 90f);

	}

	private float calculateImageSimilarity(String expected, String actual)
			throws IOException {
		long start = System.currentTimeMillis();
		File actualFile = new File(actual);
		BufferedImage image = ImageIO.read(actualFile);
		int width = image.getWidth(null);
		int height = image.getHeight(null);
		int[][] clr = new int[width][height];
		File expectedfiles = new File(expected);
		BufferedImage images = ImageIO.read(expectedfiles);
		int widthe = images.getWidth(null);
		int heighte = images.getHeight(null);
		int[][] clre = new int[widthe][heighte];
		int smw = 0;
		int smh = 0;
		int p = 0;
		// CALUCLATING THE SMALLEST VALUE AMONG WIDTH AND HEIGHT
		if (width > widthe) {
			smw = widthe;
		} else {
			smw = width;
		}
		if (height > heighte) {
			smh = heighte;
		} else {
			smh = height;
		}
		// CHECKING NUMBER OF PIXELS SIMILARITY
		for (int a = 0; a < smw; a++) {
			for (int b = 0; b < smh; b++) {
				clre[a][b] = images.getRGB(a, b);
				clr[a][b] = image.getRGB(a, b);
				if (clr[a][b] == clre[a][b]) {
					p = p + 1;
				}
			}
		}
		float w, h = 0;
		if (width > widthe) {
			w = width;
		} else {
			w = widthe;
		}
		if (height > heighte) {
			h = height;
		} else {
			h = heighte;
		}
		float s = (smw * smh);
		// CALUCLATING PERCENTAGE
		float similarityPercentage = (100 * p) / s;

		System.out.println("THE PERCENTAGE SIMILARITY IS APPROXIMATELY =" + similarityPercentage
				+ "%");
		long stop = System.currentTimeMillis();
		System.out.println("TIME TAKEN IS =" + (stop - start));
		return similarityPercentage;
	}*/

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}



