package br.com.schumaker.nogof.creational.multion.example1;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class Theme {

    private String name;
    private Color backgroundColor;
    private Color fontColor;
    private static final Map<String, Theme> themes = new HashMap<>();
    public static final String SKY = "Sky";
    public static final String FIRE = "Fire";

    static {
        Theme theme1 = new Theme();
        theme1.setName(Theme.SKY);
        theme1.setBackgroundColor(Color.BLUE);
        theme1.setFontColor(Color.BLACK);

        Theme theme2 = new Theme();
        theme2.setName(Theme.FIRE);
        theme2.setBackgroundColor(Color.RED);
        theme2.setFontColor(Color.WHITE);

        themes.put(theme1.getName(), theme1);
        themes.put(theme2.getName(), theme2);
    }

    private Theme() {
    }

    public static Theme getInstance(String nameTheme) {
        return Theme.themes.get(nameTheme);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getFontColor() {
        return fontColor;
    }

    public void setFontColor(Color fontColor) {
        this.fontColor = fontColor;
    }
}
