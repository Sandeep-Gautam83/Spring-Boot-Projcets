package com.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

//@Component
//public class UserDao implements InitializingBean, DisposableBean {

public class UserDao  {

    public UserDao() {
        System.out.println("instantiating user dao");
    }


    String connection = null;
    Scanner sc = null;



    public void saveUser() {
        System.out.println("---------------------");
        System.out.println("using db connection :");
        System.out.println(connection.length());
        System.out.println("save user");
        System.out.println("done");
        System.out.println("-----------------------------");
    }
    public void printAllUser() {
        System.out.println("--------------------");
        System.out.println("using db connection");
        System.out.println(connection.length());
        System.out.println("-----------done------");
    }


@PostConstruct
//    @Override
    public void inti() throws Exception {
        sc=new Scanner(System.in);
        System.out.println("Enter connection : ");
        connection = sc.nextLine();
    }


@PreDestroy
//    @Override
    public void des() throws Exception {
        connection=null;
        sc.close();
        System.out.println("destroying connection");
    }
}
