package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Create {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new EdgeDriver();
    
    //Launch URL "http://leaftaps.com/opentaps/control/login"
    driver.get("http://leaftaps.com/opentaps/control/login");
    
    //Enter UserName and Password Using Id Locator
    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
    
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    
    //Click on Login Button using Class Locator
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    driver.manage().window().maximize();
    //Click on CRM/SFA Link
    driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
    
    //Click on Leads Button
    driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
    
    //Click on create Lead Button
    driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
    
    //Enter CompanyName using id Locator
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
    
    Thread.sleep(1000);
    //Enter FirstName using id Locator
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ABC1");
    Thread.sleep(1000);
    
    //Enter LastName using id Locator
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("ABC2");
    Thread.sleep(1000);
    
    //Enter your mail-id
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
    Thread.sleep(1000);
    
    //Enter phone number
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
    Thread.sleep(1000);
    
    //Click on create Lead Button Using name Locator
    driver.findElement(By.name("submitButton")).click();
    Thread.sleep(1000);
    
    
    
	}

}
