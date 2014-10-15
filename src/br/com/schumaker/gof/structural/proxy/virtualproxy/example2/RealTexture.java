package br.com.schumaker.gof.structural.proxy.virtualproxy.example2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class RealTexture implements Texture {

    private final String textureFileName;

    public RealTexture(String textureFileName) {
        this.textureFileName = textureFileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading: " + textureFileName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(RealTexture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void renderTexture() {
        System.out.println("Rendering: " + textureFileName);
    }
}
