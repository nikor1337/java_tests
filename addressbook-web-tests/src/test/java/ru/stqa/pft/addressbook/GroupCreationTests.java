package ru.stqa.pft.addressbook;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class GroupCreationTests {
  ChromeDriver driver;

  @BeforeMethod
  public void setUp() throws Exception{
    driver = new ChromeDriver();
    driver.get("http://192.168.1.69/addressbook/");
    driver.manage().window().maximize();
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testGroupCreation() {
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).sendKeys("test1");
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).sendKeys("test2");
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).sendKeys("test3");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("group page")).click();
  }
}
