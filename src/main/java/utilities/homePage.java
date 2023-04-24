package utilities;

import org.openqa.selenium.By;

import objectRep.baseclass;

public class homePage extends baseclass {
	public static By Electronics = By.xpath("//div[@class=\"xtXmba\"]//following::div[14]");
	public static By MobileAccessory = By.xpath("//a[contains(text(), \"MobileAccessory\")]");
	public static By Electronics2 = By.xpath("//div[@class=\"exehdJ\"]//following::span[2]");
	public static By Mi = By.xpath("//div[@class=\"_24_Dny\"]//following::div[16]");
	public static By Mobiles = By.xpath("//a[contains(text(), \"Mobiles\")]");
	public static By searchtext = By.xpath("//input[@name=\"q\"]");
	public static By search = By.xpath("//button[@type=\"submit\"]");
	public static By Samsung = By.xpath("//div[contains(text(), \"SAMSUNG Galaxy S23 Ultra 5G (Green, 256\")]");
	public static By playVideo = By.xpath("//div[@class=\"_2usHgU\"]");
	public static By addToCart = By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]");
	
	
	public static void overElectronics() throws Exception {
		mouseOver(Electronics);
		//Thread.sleep(3000);
		click(MobileAccessory);
	}
	public static void elect() throws Exception {
		sleep();
		mouseOver(Electronics2);
		Thread.sleep(2000);
		click(Mobiles);
		sleep();
		click(Mi);
	}
	public static void fillSearch(String searchWord) {
		enterText(searchtext, searchWord);
		click(search);
		sleep();
		click(Samsung);
		
	}
	public static void overVideo() {
		mouseOver(playVideo);
	}
	public static void cartAdded() {
		click(addToCart);
	}


}
