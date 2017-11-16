/*This is the Page Object class, here all the methods are 
 * defined to search for different products and add to the shopping cart
 * Even Methods are defined to validate the added items in the shopping cart
 * These methods can be re-used to avoid the code duplication and speed up the automation testing.
 */

package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class AddToShoppingCartPage {
	public static WebElement element = null;

	public static void enterProductToSearch(WebDriver driver, String product) {
		element = driver.findElement(By.id("twotabsearchtextbox"));
		element.clear();
		element.sendKeys(product);
	}
	
	public static void clickSearchButton(WebDriver driver) {
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
	}
	
	public static void addToShoppingCart(WebDriver driver) {
		driver.findElement(By.id("add-to-cart-button")).click();
	}
	
	public static void clickOnShoppingCart(WebDriver driver) {
		driver.findElement(By.id("nav-cart-count")).click();
	}

	public static void clickOnProceedCheckout(WebDriver driver) {
		driver.findElement(By.xpath("//input[@name='proceedToCheckout']")).click();
	}
	
	
	//Product1: locator for Head first java book search
	public static void clickOnProduct1(WebDriver driver) {
		driver.findElement(By.xpath("//h2[@data-attribute='Head First Java, 2nd Edition']")).click();
	}
	
	//Product2: locator for Head first python book search
	public static void clickOnProduct2(WebDriver driver) {
		driver.findElement(By.xpath("//h2[@data-attribute='Head First Python: A Brain-Friendly Guide']")).click();
	}
	
	

	
//	Method to search and add products to shopping cart
	public static void addProductToShoppingCart(WebDriver driver, String product1, String product2 ) {
//		To add product1 : Head first java book to the shopping cart
		Reporter.log("Searching for head first java book", true);
		enterProductToSearch(driver, product1);
		clickSearchButton(driver);
		clickOnProduct1(driver);
		addToShoppingCart(driver);
		Reporter.log("Searched head first java book and added to the shopping cart", true);
		
//		To add product2 : Head first python book to the shopping cart
		Reporter.log("Searching for head first python book", true);
		enterProductToSearch(driver, product2);
		clickSearchButton(driver);
		clickOnProduct2(driver);
		addToShoppingCart(driver);
		Reporter.log("Searched head first python book and added to the shopping cart", true);
		
	}
	
//	Method to validate the shopping cart
	public static void validateShoppingCart(WebDriver driver) {
		Reporter.log("Checking for items in the shopping cart", true);
		clickOnShoppingCart(driver);
		clickOnProceedCheckout(driver);
		Reporter.log("found items in shopping cart and clicked on proceed to check out", true);
	}
}






