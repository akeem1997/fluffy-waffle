package testCase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRep.baseclass;

public class tc1 extends baseclass {

	@Test(priority = 1, groups = {"sanity", "Regression"})
	public void browserOpen() {
	openBrowser("chrome");
	driver.manage().window().maximize();
	}
	@Test(priority = 2, groups = {"sanity", "Regression"})
	public void urlOpen() throws Exception {
	openUrl();

	Thread.sleep(4000);
	}
	@Test(priority = 3, groups = {"sanity", "Regression"})
	public void clickCancel() {
	cancel();
	}
	@Test(priority = 4, groups = {"sanity"})
	public void flipkart() {
	try {
		utilities.homePage.overElectronics();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		utilities.homePage.elect();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sleep();
	}
	
	@Test(priority = 5, groups = {"sanity"})
	public void moveSlide() {
	WebElement slider = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div/div[1]/div/section[2]/div[3]/div[1]/div[1]/div"));
	
	Actions act = new Actions(driver);
	act.dragAndDropBy(slider, 50, 0).perform();
	sleep();
	}
	@Test(priority = 6, groups = {"Regression"})
	public void clickSearch() {
	utilities.homePage.fillSearch("samsung s23 ultra");
	sleep();
	}
	@Test(priority = 7,  groups = {"Regression"})
	public void newTab() {
	Set<String>handles = driver.getWindowHandles();
	Iterator<String> it = handles.iterator();
	String parentId = (String) it.next();
	String childId = (String) it.next();
	driver.switchTo().window(childId);
	sleep();
	}
	
	@Test(priority = 8,  groups = {"Regression"})
	public void verifyPrice() {
	String price = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
	
	double productPrice = Double.parseDouble(price.replaceAll("[^0-9.]", ""));
	if(productPrice >= 0) {
		System.out.println("product price is greater than or equals to 0");
		
	} 
	else {
		System.out.println("product price is less than 0");
	}
	}
	@Test(priority = 9,  groups = {"Regression"})
	public void keyboardEvent() throws Exception {
	utilities.homePage.overVideo();
	sleep();
    WebElement pinCode = driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]"));
	Actions act = new Actions(driver);
	act.sendKeys(pinCode, Keys.NUMPAD5).perform();
	act.sendKeys(Keys.NUMPAD6).perform();
	act.sendKeys(Keys.NUMPAD0).perform();
	act.sendKeys(Keys.NUMPAD0).perform();
	act.sendKeys(Keys.NUMPAD3).perform();
	act.sendKeys(Keys.NUMPAD7).perform();
	sleep();
	driver.findElement(By.xpath("//span[@class=\"_2P_LDn\"]")).click();
	sleep();
	driver.findElement(By.xpath("//span[@class=\"YxlyDn\"]")).click();
	sleep();
	boolean popUp = driver.findElement(By.xpath("//div[@class=\"_1_YTe1\"]")).isDisplayed();
	if (popUp) {
		System.out.println("modal pop up is opened");
	} else {
		System.out.println("modal pop up is not opened");

	}
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _1KAjNd\"]")).click();
	sleep();
	
	
	
	
	}		
	@Test(priority = 10, groups = {"Regression"})
	public void cart() {
		utilities.homePage.cartAdded();
	}
	@Test(priority = 11, groups = {"sanity", "Regression"})
	public void closeBrowser() {
		sleep();
		quit();
	}
			
	



}
