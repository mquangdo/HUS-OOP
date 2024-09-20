package fnafsimulator;

public class Client {
    public static void main(String[] args) {
        ConcreteCameraSystem concreteCameraSystem = new ConcreteCameraSystem();
        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Camera camera3 = new Camera();
        Camera camera4 = new Camera();
        Camera camera5 = new Camera();
        concreteCameraSystem.registerCamera(camera1);
        concreteCameraSystem.registerCamera(camera2);
        concreteCameraSystem.registerCamera(camera3);
        concreteCameraSystem.registerCamera(camera4);
        concreteCameraSystem.registerCamera(camera5);
        concreteCameraSystem.crash();
    }
}
