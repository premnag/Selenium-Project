package juiceshopAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class NewCustomer {
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://juice-shop.herokuapp.com/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().activeElement();
		WebElement dismissButton= driver.findElement(By.xpath("//*[contains(text(),'Dismiss')]/ancestor::button"));
		dismissButton.click();
		
		/*
		 * WebElement notYetACustomerButton
		 * =driver.findElement(By.xpath("//*[@id='newCustomerLink']"));
		 * notYetACustomerButton.click();
		 * 
		 * //New user registration
		 * 
		 * WebElement emailId= driver.findElement(By.xpath("//*[@id='emailControl']"));
		 * emailId.sendKeys("premkumar.nagarajan85@gmail.com");
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("//*[@id='passwordControl']"));
		 * password.sendKeys("Password123");
		 * 
		 * WebElement repeatPassword =
		 * driver.findElement(By.xpath("//*[@id='repeatPasswordControl']"));
		 * repeatPassword.sendKeys("Password123");
		 * 
		 * WebElement dropdownMenu=
		 * driver.findElement(By.xpath("//*[@id='mat-select-0']"));
		 * dropdownMenu.click();
		 * 
		 * WebElement dropDownChoices =
		 * driver.findElement(By.xpath("//*[@id='mat-option-1']"));
		 * dropDownChoices.click();
		 * 
		 * WebElement answer =
		 * driver.findElement(By.xpath("//*[@id='securityAnswerControl']"));
		 * answer.sendKeys("SarojaNagarajan");
		 * 
		 * WebElement registerButton =
		 * driver.findElement(By.xpath("//*[@id='registerButton']"));
		 * registerButton.click();
		 */
		 	

		//Already registered user
		
		

		
		  WebElement emailIdLogin = driver.findElement(By.xpath("//*[@id='email']"));
		  emailIdLogin.sendKeys("premkumar.nagarajan85@gmail.com");
		  
		  WebElement passwordLogin =
		  driver.findElement(By.xpath("//*[@id='password']"));
		  passwordLogin.sendKeys("Password123");
		  
		  
		  WebElement loginButton =
		  driver.findElement(By.xpath("//*[@id='loginButton']")); loginButton.click();
		 
		
		
		//Selecting products
		
//		  WebElement applePomaceAddToBasket = driver.findElement(By.xpath("//div[contains(text(),'Apple Pomace')]/../../..//*[contains(text(),'Add to Basket')]"));
//		  applePomaceAddToBasket.click();
		  WebElement bananaJuiceAddToBasket = driver.findElement(By.xpath("//div[contains(text(),'Banana Juice')]/../../..//*[contains(text(),'Add to Basket')]"));
		  bananaJuiceAddToBasket.click();
	}

}
