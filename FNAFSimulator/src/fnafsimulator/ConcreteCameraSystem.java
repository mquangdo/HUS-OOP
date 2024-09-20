package fnafsimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcreteCameraSystem implements CameraSystem{
    List<Camera> cameras;

    public ConcreteCameraSystem(){
        this.cameras = new ArrayList<>();
    }

    @Override
    public void registerCamera(Camera camera){
        cameras.add(camera);
    }

    @Override
    public void removeCamera(Camera camera){
        cameras.remove(camera);
    }

    @Override
    public void notifyCamera(){
        Random numCamera = new Random();
        int num = numCamera.nextInt(5);
        for (int i = 0; i < cameras.size(); i++){
            if (i == num){
                System.out.println(cameras.get(i).warning() + i);
            } else {
                System.out.println(cameras.get(i).update() + i);
            }
        }
    }

    public void crash(){
        System.out.println("Cameras are crashing");
        notifyCamera();
    }
}
