package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/edit");
		driver.manage().window().maximize();

		WebElement fullName = driver.findElement(By.id("fullName"));
		fullName.sendKeys("Prem Kumar Nagarajan");

		WebElement appendText = driver.findElement(By.id("join"));
		appendText.sendKeys(" boy");
		appendText.sendKeys(Keys.TAB);

		WebElement insideText = driver.findElement(By.id("getMe"));
		String textContent= insideText.getAttribute("value");
		System.out.println(textContent);

		WebElement clearText = driver.findElement(By.id("clearMe"));
		clearText.clear();

		WebElement confirmDisabled = driver.findElement(By.id("noEdit"));
		boolean status = confirmDisabled.isEnabled();
		if (status == true){
			System.out.println("The edit field is enabled");	
		} else
		{
			System.out.println("The edit field is disabled");

		}

		WebElement confirmReadOnly = driver.findElement(By.id("dontwrite"));
		String status1 = confirmReadOnly.getAttribute("readOnly");
		System.out.println(status1);


	}
}	



