package seleniumLearning;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://www.google.com");

		
		  Dimension dimension = new Dimension(1366, 768);
		  driver.manage().window().setSize(dimension);
		 



	}
}
