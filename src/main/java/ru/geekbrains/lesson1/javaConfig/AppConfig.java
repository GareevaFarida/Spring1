package ru.geekbrains.lesson1.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name="cameraRoll")
    public CameraRoll cameraRoll() {
        return new ColorCameraRoll() ;
    }

    @Bean(name="camera")
    @Scope("prototype")//чтобы создался новый объект, а не использовался singleton
    public Camera camera(CameraRoll cameraRoll){
        Camera camera = new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
    @Bean(name="helloMan")
    public HelloMan helloMan(@Value("Name inside class @Configuration") String name) {
        HelloMan helloMan = new HelloManOnceSay(name);
        return helloMan;
    }
}

