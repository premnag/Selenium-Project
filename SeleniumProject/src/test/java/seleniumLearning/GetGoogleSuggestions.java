package seleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GetGoogleSuggestions {

	static WebElement q;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");


		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys("Prison Break");


		/*
		 * PageFactory.initElements(driver,GetGoogleSuggestions.class);
		 * q.sendKeys("Pondy");
		 */



		List<WebElement>searchSuggestions = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]"));

		for (WebElement webElement:searchSuggestions) {
			System.out.println(webElement.getText());	

		}

	}
}


