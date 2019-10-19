package ru.geekbrains.lesson1.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config_xml.xml");
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();

        HelloManOnceSay helloManOnceSay = context.getBean("helloMan",HelloManOnceSay.class);
        helloManOnceSay.helloSay();

    }
}
