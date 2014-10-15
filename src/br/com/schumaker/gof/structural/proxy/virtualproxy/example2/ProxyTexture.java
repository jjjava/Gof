package br.com.schumaker.gof.structural.proxy.virtualproxy.example2;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class ProxyTexture implements Texture {

    private Texture texture;
    private final String fileName;

    public ProxyTexture(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void renderTexture() {
        if (texture == null) {
            texture = new RealTexture(fileName);
        }
        texture.renderTexture();
    }
}
