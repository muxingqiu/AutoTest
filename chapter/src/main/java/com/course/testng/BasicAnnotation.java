package com.course.testng;

import org.testng.annotations.*;

import javax.xml.soap.SOAPPart;

public class BasicAnnotation {
    //Test是最基本的注解
    @Test
    public void testCase1(){
        System.out.println("这是最基本的标签");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在Test标签之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在Test标签之后运行的");
    }




}

