package week4.day1w4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningWindowHandles {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> win=new ArrayList<String>(handles);
		System.out.println(win.size());
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(win.get(0));
		driver.close();
		
	}

}
