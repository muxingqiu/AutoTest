package com.course.testng.groups_class;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class Class2 {
    public void stu2(){
        System.out.println("这是stu组第二个输出");
    }
}
