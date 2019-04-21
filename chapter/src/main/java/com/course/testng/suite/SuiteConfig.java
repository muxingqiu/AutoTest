package com.course.testng.suite;
import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件之前运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件之后运行");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("测试之前执行");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("测试之后执行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类之前执行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("类之后执行");
    }


}
