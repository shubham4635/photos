package org.example.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sk {

@BeforeMethod
        public void login(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");
            driver.manage().window().minimize();

        }
        @Test
        public void Text () {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");
            driver.manage().window().maximize();

        }
        @AfterMethod
        public void Text1 () {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/login/");
            driver.manage().window().fullscreen();

        }
    }
