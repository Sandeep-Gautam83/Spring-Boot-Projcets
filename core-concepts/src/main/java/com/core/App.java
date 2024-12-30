package com.core;

import com.core.college.Student;
import com.core.college.Teacher;
import com.core.concepts.Car;
import com.core.concepts.ConfigClass;
import com.core.concepts.Engine;
import com.core.lifecycle.UserDao;
import com.core.qualifier.Human;
import com.core.scopes.Samosa;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Project started");
        System.out.println("Starting point");

//        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");        //xml config used
//
//
        AnnotationConfigApplicationContext container= new AnnotationConfigApplicationContext(ConfigClass.class);     // java cofig used
//        //container
//        Engine engine1 = container.getBean("engine1", Engine.class);
//       engine1.startEngine();
//
//        System.out.println(" ____________________________________   ");
//        Car car = container.getBean("car",Car.class);
//        car.start();
//
//
//        Student student =container.getBean("student",Student.class);
//        System.out.println(student);
//        student.show();
//
//        Teacher teacher = container.getBean("teacher",Teacher.class);
//        System.out.println(teacher);
//
//        Human kartik = container.getBean("human",Human.class);
//        kartik.tryColdDrink();

//        Car car = container.getBean("car", Car.class);
//        car.start();


//        UserDao userDao = container.getBean("userDao",UserDao.class);
//        userDao.saveUser();

//        container.registerShutdownHook();

        Samosa samosa = container.getBean("samosa", Samosa.class);
        Samosa samosa1 =  container.getBean("samosa",Samosa.class);

        System.out.println(samosa);
        System.out.println(samosa1);
        container.close();



    }
}
