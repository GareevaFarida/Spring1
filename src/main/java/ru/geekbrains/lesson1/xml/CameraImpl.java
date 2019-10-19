package ru.geekbrains.lesson1.xml;

public class CameraImpl implements Camera {
    private CameraRoll cameraRoll;

    public void doPhotograph() {
        System.out.println("щёлк!");
        cameraRoll.processing();
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
}
