package br.com.schumaker.gof.structural.proxy.virtualproxy.example2;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 18/09/2014
 */
public class Client {

    public static void main(String[] args) {
        final Texture IMAGE1 = new ProxyTexture("HiRes_10MB_Texture1");
        final Texture IMAGE2 = new ProxyTexture("HiRes_10MB_Texture2");
        final Texture IMAGE3 = new ProxyTexture("HiRes_50MB_Texture");

        IMAGE1.renderTexture(); // loading necessary
        IMAGE3.renderTexture(); // loading necessary
        IMAGE1.renderTexture(); // loading unnecessary
        IMAGE2.renderTexture(); // loading necessary
        IMAGE1.renderTexture(); // loading unnecessary
        IMAGE1.renderTexture(); // loading unnecessary
        IMAGE2.renderTexture(); // loading unnecessary
        IMAGE1.renderTexture(); // loading unnecessary
        IMAGE3.renderTexture(); // loading unnecessary
        IMAGE3.renderTexture(); // loading unnecessary
        IMAGE1.renderTexture(); // loading unnecessary
    }
}
