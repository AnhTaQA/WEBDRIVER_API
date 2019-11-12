package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	// khai bao bien driver
	WebDriver driver;
	
	
	//before class chạy trước tất cả những test case
	@BeforeClass
	public void beforeClass() {
		
		//khai bao duong dan cho driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\anhtt\\Desktop\\Software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	// Khoi tao firefox driver
		driver = new FirefoxDriver();
		
		// mo URL 
		driver.get("https://github.com/AnhTaQA");
		//wait định ngầm; thời gian chờ cho 1 element hienr thị trên màn hinh. Cái hàm này sẽ ảnh hưởng đến hàm findElement & findElements
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	
  @Test
  public void f() {
	  System.out.println("Start test");
	  
	  
  }
//After class chạy sau khi tất cả các test case đã chạy xong
  @AfterClass
  public void afterClass() {
	  
	  //dong cua so window dang chon
	  driver.quit();
  }

}
