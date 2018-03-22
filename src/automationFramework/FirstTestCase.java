package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Abha\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
driver.get("http://www.phptravels.net");
Actions act = new Actions(driver);
act.click(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a"))).build().perform();
act.click(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a"))).build().perform();
driver.findElement(By.name("username")).clear();
driver.findElement(By.name("username")).sendKeys("arg@yahoo.com");
driver.findElement(By.name("password")).sendKeys("Year2017");
driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/div[4]/button")).click();
driver.findElement(By.xpath("/html/body/nav[1]/div/div/div/ul/li[3]/a")).click();
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div[3]/div/table/tbody/tr[1]/td/div/div[1]/div/a/img")));
driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/table/tbody/tr[1]/td/div/div[2]/div/div[2]/h4/a/b")).click();
Select Adults= new Select(driver.findElement(By.name("adults"))); 
Adults.selectByIndex(2);
Select child = new Select(driver.findElement(By.name("child"))); 
child.selectByIndex(2);
Select rooms = new Select(driver.findElement(By.name("roomscount"))); 
rooms.selectByIndex(2);
driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/section/form[1]/div/div[2]/div[1]/button"));

System.out.println("Successfully opened the website www.Store.Demoqa.com");
	}

}
