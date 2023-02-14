package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		ChromeDriver driver2 = driver;
		driver2.get("http://leaftaps.com/opentaps");
			driver2.manage().window().maximize();
			driver2.findElement(By.id("username")).sendKeys("demoSalesManager");
			driver2.findElement(By.id("password")).sendKeys("crmsfa");
			driver2.findElement(By.className("decorativeSubmit")).click();
			driver2.findElement(By.linkText("CRM/SFA")).click();
			driver2.findElement(By.linkText("Leads")).click();
			driver2.findElement(By.linkText("Create Lead")).click();
			WebElement source = driver2.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select op=new Select(source);
			op.selectByIndex(1);
			op.selectByVisibleText("Automobile");
			op.selectByValue("CATRQ_CARNDRIVER");
			driver2.close();
	}

}
