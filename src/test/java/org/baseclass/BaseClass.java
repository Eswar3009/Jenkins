package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static WebDriver driver;
	 public static Actions a;
	 public static File f;
	 
		public static void launch() {
			 driver=new ChromeDriver();

		}
		public static void toGetUrl(String url) {
			driver.get(url);

		}
		public static void toMaximize() {
			driver.manage().window().maximize();

		}
		public static void toGetCurrentUrl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
	 }
		
		public static void toGetTitle() {
			String title = driver.getTitle();
			System.out.println(title);

		}
		public static void fill(WebElement element,String usertext ) {
			element.sendKeys(usertext);

		}
		
		public static void toClick(WebElement element) {
			element.click();

		}
		public static void toQuit() {
			driver.quit();

		}
		public static void toGetText(WebElement element ) {
			String text = element.getText();
			System.out.println(text);
			}
		
		public static void toGetAttribute(WebElement element,String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);

		}
		
		public static void moveToElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();

		}
		
		public static void dragAndDrop(WebElement src, WebElement target) {
			a.dragAndDrop(src, target).perform();

		}
		
		public static void doubleclick(WebElement element) {
	a.doubleClick(element).perform();		

		}
		
		public static void contextClick(WebElement element) {
			a.contextClick(element).perform();

		}
		
		public static void keyup(WebElement element) {
			

		}
		
		private void readFile(String path) throws FileNotFoundException{	
	    f=new File(path);
	    FileInputStream fin=new FileInputStream(f);
		}
		
		private void writeFile(String path) throws FileNotFoundException {
			f=new File(path);
			FileOutputStream fos=new FileOutputStream(f);
		}
}
