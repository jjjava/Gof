package br.com.schumaker.gof.structural.proxy;

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
    }

    @Override
    public void renderTexture() {
        System.out.println("Rendering: " + textureFileName);
    }
}
