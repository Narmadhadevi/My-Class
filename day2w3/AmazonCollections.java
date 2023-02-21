package week3.day2w3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCollections {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	int size = price.size();
	System.out.println(size);
	List<Integer> newPrice = new ArrayList<Integer>();
	 for(WebElement value:price) {
		 String text= value.getText();
		 System.out.println(text);
		  String rep= text.replace(",", "");
		  if(!rep.isBlank()) {
	 int parseInt = Integer.parseInt(rep);
	 newPrice.add(parseInt);
	 }
	 }
	System.out.println(newPrice);
driver.close();
}
}
