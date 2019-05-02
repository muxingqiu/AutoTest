package com.course.testng.groups_class;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class Class1 {
    public void stu1(){
        System.out.println("这是stu组执行的结果1");
    }
}
