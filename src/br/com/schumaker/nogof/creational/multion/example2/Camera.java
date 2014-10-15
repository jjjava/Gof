package br.com.schumaker.nogof.creational.multion.example2;

import java.util.HashMap;

/**
 *
 * @author Hudson Schumaker
 */
public class Camera {

    private Integer hardwareId;
    private String location;
    private static final HashMap<Integer, Camera> instance = new HashMap<>();
    private static final Camera cam1;//melhora feita por mim
    private static final Camera cam2;//melhora feita por mim

    static {
        cam1 = new Camera();
        cam1.setHardwareId(001);
        cam1.setLocation("Back");
        cam2 = new Camera();
        cam2.setHardwareId(002);
        cam2.setLocation("Front");
        instance.put(cam1.getHardwareId(), cam1);
        instance.put(cam2.getHardwareId(), cam2);
    }

    private Camera() {
    }

    public static Camera getInstance(Integer hardwareId) {
        return Camera.instance.get(hardwareId);
    }

    public Integer getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(Integer hardwareId) {
        this.hardwareId = hardwareId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}