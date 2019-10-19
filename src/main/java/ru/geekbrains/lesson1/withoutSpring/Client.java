package ru.geekbrains.lesson1.withoutSpring;

public class Client {
    public static void main(String[] args) {
        Camera camera = new Camera();
        CameraRoll cameraRoll = new ColorCameraRoll();
//        CameraRoll cameraRoll = new BlackAndWhiteCameraRoll();

        camera.setCameraRoll(cameraRoll);
        camera.doPhotograph();
    }
}
