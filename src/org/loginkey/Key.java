package org.loginkey;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key {
public static void main(String a []) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win 10\\eclipse-workspace\\A1\\Driver\\chromedriver.exe");
	WebDriver driv = new ChromeDriver();
	driv.get("https://www.facebook.com/");
	driv.manage().window().maximize();
	driv.findElement(By.id("email")).click();
	String name = "AARE505";
	char test;
	Robot r = new Robot();
for(int i=0;i<name.length();i++) {
	test = name.charAt(i);
	r.keyPress(test);
	r.keyRelease(test);
}
Actions ac = new Actions(driv);
ac.doubleClick(driv.findElement(By.id("email"))).perform();
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_X);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_X);
Thread.sleep(5000);
driv.findElement(By.id("pass")).click();
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);	
Thread.sleep(5000);
driv.findElement(By.name("login")).click();
}
}
