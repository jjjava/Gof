package br.com.schumaker.gof.structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 12/09/2014
 */
public class ThemeFactory {

    private static final Map<Class<? extends Theme>, Theme> theme = new HashMap<>();
    public static final Class<ThemeAsterisk> ASTERISK = ThemeAsterisk.class;
    public static final Class<ThemeHifen> HIFEN = ThemeHifen.class;
    public static final Class<ThemeHudson> HUDSON = ThemeHudson.class;

    public static Theme getTheme(Class<? extends Theme> clazz) {
        if (!theme.containsKey(clazz)) {
            try {
                theme.put(clazz, clazz.newInstance());
            } catch (IllegalAccessException | InstantiationException e) {
                System.err.printf("Error:", e);
            }
        }
        return theme.get(clazz);
    }
}
