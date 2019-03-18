package jenkinsbat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a {
	@Test
	public void baidu() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		String url="https://www.baidu.com";
		driver.get(url);
		driver.findElement(By.name("wd")).sendKeys("jenkins");
		driver.findElement(By.id("su")).click();
	}
}
