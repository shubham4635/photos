package org.example.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 5)
    public void FirstName(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
       driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shubham");
    }
    @Test(priority = 6)
    public void LastName(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kangune");
    }
    @Test(priority = 4)
    public void Email(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Shubhamkangune@gmail.com");
    }
    @Test(priority = 3)
    public void Password(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Shubhamkangune@gmail.com");
    }
@Test(priority = 1)
public void Gender(){
    System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    driver.findElement(By.id("u_0_5_TC")).isSelected();
}

@Test(priority = 2)
public void Date(){
    System.setProperty("webdriver.chrome.driver", "D:\\selenium files\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
    Select day= new Select( driver.findElement(By.xpath("//select[@name='birthday_day']")));
    day.selectByValue("31");
    Select month=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
    month.selectByValue("5");
    Select year=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
    year.selectByValue("2001");
}
}
