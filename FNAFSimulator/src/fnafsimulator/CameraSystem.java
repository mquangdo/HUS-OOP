package fnafsimulator;

public interface CameraSystem {
    void removeCamera(Camera camera);

    void registerCamera(Camera camera);

    void notifyCamera();
}
