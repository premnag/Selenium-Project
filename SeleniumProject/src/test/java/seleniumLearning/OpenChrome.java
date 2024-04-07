package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.out.println();
		
		String expectedTitle = "Google";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
            
        }
		driver.close();
		// TODO Auto-generated method stub

	}

}
