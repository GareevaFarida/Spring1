package ru.geekbrains.lesson1.javaConfig;

//public class CameraImpl implements Camera {
//    private CameraRoll cameraRoll;
//
//    public void doPhotograph() {
//        System.out.println("щёлк!");
//        cameraRoll.processing();
//    }
//
//    public CameraRoll getCameraRoll() {
//        return cameraRoll;
//    }
//
//    public void setCameraRoll(CameraRoll cameraRoll) {
//        this.cameraRoll = cameraRoll;
//    }
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class CameraImpl implements Camera {
    @Autowired
    @Qualifier("cameraRoll")
    private CameraRoll cameraRoll;

    @Value("false")
    private boolean broken;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public boolean isBroken() {
        return broken;
    }

    public void breaking() {
        this.broken = true;
    }

    public void doPhotograph() {
        if (isBroken()) {
            System.out.println("Фотоаппарат сломан!");
            return;
        }
        System.out.println("Сделана фотография!");
        cameraRoll.processing();
    }
}


