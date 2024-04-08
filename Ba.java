package org.example.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ba {
    @BeforeMethod
    public void we(){
        System.out.println("Asd");
    }
    @Test(enabled = true)
    public void qw(){
        System.out.println("hello wqe");
    }
    @Test(groups = "smoke")
    public void qw1(){
        System.out.println("hello re ");
    }
    @Test(groups = "smoke")
    public void q1w(){
        System.out.println("hello qw ");
    }
@AfterMethod
    public void wq(){
    System.out.println(" POp");
}
}
