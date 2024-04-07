package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0121tn9pu6krc1ibim6u5mr9qn388607.node0");
		WebElement name= driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("Prehaan");

		WebElement country = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		country.sendKeys(" Madras");

		WebElement clearField = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\']"));
		clearField.clear();

		WebElement disabledCheck = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean enabled = disabledCheck.isEnabled();
		System.out.println(enabled);
		
		
	}

}
