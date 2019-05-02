package com.course.testng.groups_class;

import org.testng.annotations.Test;

@Test(groups = "tec")
public class Class3 {
    public void class3(){
        System.out.printf("这是tec的第一个输出");
    }
}
