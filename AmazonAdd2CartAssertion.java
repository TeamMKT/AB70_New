package Learning.PractiseAutomation;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AmazonAdd2CartAssertion {

	@Test
	public void n1() throws InterruptedException {	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	Assertion a2=new Assertion();
	Thread.sleep(3000);
	WebElement dr=driver.findElement(By.id("twotabsearchtextbox"));
	dr.sendKeys("toys");
	WebElement dr1=driver.findElement(By.id("nav-search-submit-button"));
dr1.click();
Thread.sleep(3000);
//click on image then navigate to anchor tag 
List<WebElement>list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
System.out.println(list.size());
list.get(0).click();
//child and parent window concept came
Set<String>s1=driver.getWindowHandles();
Iterator<String>pcid=s1.iterator();
String pid=pcid.next();
System.out.println(pid);
String cid=pcid.next();
driver.switchTo().window(cid);
Thread.sleep(3000);
WebElement addToCart=driver.findElement(By.id("add-to-cart-button"));
addToCart.click();
//Thread.sleep(3000);
	//input[@id='add-to-wishlist-button-submit']

a2.assertEquals(driver.getTitle(),"Amazon.in Shopping Cart");
	
	
	
	
	
	
}
}