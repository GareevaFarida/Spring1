package ru.geekbrains.lesson1.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class Client {
//    public static void main(String[] args) {
////        ApplicationContext context = new ClassPathXmlApplicationContext("config_annotations.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Camera camera = context.getBean("camera", Camera.class);
//        camera.doPhotograph();
//
//        HelloMan helloMan = context.getBean("helloMan", HelloMan.class);
//        helloMan.helloSay();
//
//    }
//}

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получает фотоаппарат
        Camera camera = context.getBean("camera", Camera.class);

        // Ломает фотоаппарат
        camera.breaking();
        // Пытается сделать фото. Неудача!
        camera.doPhotograph();

        // Просит еще один фотоаппарат
        camera = context.getBean("camera", Camera.class);
        // Пытается сделать фото
        camera.doPhotograph();
    }
}

