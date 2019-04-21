package com.course.testng.groups;
import org.testng.annotations.*;

public class GroupsonMethod {
    @Test(groups = "client")
    public void client1(){
        System.out.println("这是客户端运行方法111");
    }

    @Test(groups = "client" )
    public void client2(){
        System.out.println("这是客户端运行方法222");
    }

    @Test(groups = "client")
    public void client3(){
        System.out.println("这是客户端运行方法333");
    }

    @Test(groups = "server")
    public void server1(){
        System.out.println("这是服务端运行方法444");
    }

    @Test(groups = "server")
    public void server2(){
        System.out.println("这是服务端运行方法555");
    }

    @Test(groups = "server")
    public void server3(){
        System.out.println("这是服务端运行方法666");
    }

    @BeforeGroups("client")
    public void before1(){
        System.out.println("这是客户端之前运行的方法");
    }

    @AfterGroups("client")
    public void after1(){
        System.out.println("这是客户端之后运行的方法");
    }

    @BeforeGroups("server")
    public void before2(){
        System.out.println("这是服务端之前运行的方法");
    }

    @AfterGroups("server")
    public void after2(){
        System.out.println("这是服务端之后运行的方法");
    }
}
