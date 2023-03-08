package week4.day2w4;

/*Step:1-Launch the url (https://erail.in/)
Step:2-Enter From as MAS
Step:3-Enter To as MDU
Step:4-Uncheck sort on Date  
Step:5-Get the Train Names
DataTable TrainList TrainListHeader stickyTrainListHeader-TableName
Ensure whether there are duplicate train names
Hint:use size() to check duplicate*/
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ERail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("buttonFromTo")).click();
		List<WebElement> tableRow = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody[1]/tr"));
		System.out.println("Size of Row "+tableRow.size());
		List<String> m=new ArrayList<String>();
		Thread.sleep(6000);
		for(int w=2;w<=tableRow.size();w++) {
			Thread.sleep(2000);
			String trainName = driver.findElement(By.xpath("//table[contains(@class,'stickyTrainListHeader')]/tbody/tr["+w+"]/td[2]")).getText();
			System.out.println(trainName);
			m.add(trainName);
		}
		System.out.println(m);
		Thread.sleep(4000);
		Set<String> set = new TreeSet<String>(m);
		if(m.size()==set.size()) {
			System.out.println("duplicate present");
		}else {
			System.out.println("No duplicate ");
		}
		driver.close();
		

	}

}
