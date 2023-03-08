package week4.day1w4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());;
alert.sendKeys("Happy learning");
alert.accept();
driver.close();
	}

}
