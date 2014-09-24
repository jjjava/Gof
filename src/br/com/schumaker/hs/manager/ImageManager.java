package br.com.schumaker.hs.manager;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import javax.imageio.ImageIO;

/**
 *
 * @author Hudson Schumaker
 * @version 2.4.9
 * @since 2010
 */
public class ImageManager {

    private HashMap sprites;

    public ImageManager() {
        sprites = new HashMap();
    }

    private BufferedImage loadImage(String name) {
        URL url = null;
        try {
            url = getClass().getClassLoader().getResource(name);
            return ImageIO.read(url);
        } catch (IOException e) {
            return null;
        }
    }

    public BufferedImage getSprite(String name) {
        BufferedImage img = (BufferedImage) sprites.get(name);
        if (img == null) {
            img = loadImage("res/" + name);
            sprites.put(name, img);
        }
        return img;
    }
}