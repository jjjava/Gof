package br.com.schumaker.hs.manager;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.util.ArrayList;

/**
 *
 * @author Hudson Schumaker
 * @version 1.17.5
 * @since 2013 Java 7 port
 */
public class ScreenManager {

    private static GraphicsDevice device;
    private static ScreenManager instance;

    private ScreenManager() {
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        device = environment.getDefaultScreenDevice();
    }

    public static ScreenManager getInstance() {
        if (instance == null) {
            instance = new ScreenManager();
        }
        return instance;
    }

    public String getCurrentDisplayMode() {
        String mode = device.getDisplayMode().getWidth() + ","
                + device.getDisplayMode().getHeight() + ","
                + device.getDisplayMode().getBitDepth() + ","
                + device.getDisplayMode().getRefreshRate();
        return mode;
    }

    public ArrayList<String> getCompatibleDisplayModes() {
        ArrayList<String> modes = new ArrayList<>();
        DisplayMode[] mode = device.getDisplayModes();
        for (int k = 0; k < mode.length; k++) {
            modes.add(mode[k].getWidth() + ","
                    + mode[k].getHeight() + ","
                    + mode[k].getBitDepth() + ","
                    + mode[k].getRefreshRate());
        }
        return modes;
    }

    public int getCountCompatibleDisplayModes() {
        DisplayMode[] mode = device.getDisplayModes();
        return mode.length;
    }

    public void restoreScreen() {
        Window window = device.getFullScreenWindow();
        if (window != null) {
            window.dispose();
        }
        device.setFullScreenWindow(null);
    }

    public DisplayMode findFirstCompatibleMode(DisplayMode modes[]) {
        DisplayMode goodModes[] = device.getDisplayModes();
        for (int i = 0; i < modes.length; i++) {
            for (int j = 0; j < goodModes.length; j++) {
                if (displayModesMatch(modes[i], goodModes[j])) {
                    return modes[i];
                }
            }
        }
        return null;
    }

    public boolean displayModesMatch(DisplayMode mode1, DisplayMode mode2) {
        if (mode1.getWidth() != mode2.getWidth() || mode1.getHeight() != mode2.getHeight()) {
            return false;
        }

        if (mode1.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
                && mode2.getBitDepth() != DisplayMode.BIT_DEPTH_MULTI
                && mode1.getBitDepth() != mode2.getBitDepth()) {
            return false;
        }

        if (mode1.getRefreshRate()
                != DisplayMode.REFRESH_RATE_UNKNOWN
                && mode2.getRefreshRate()
                != DisplayMode.REFRESH_RATE_UNKNOWN
                && mode1.getRefreshRate() != mode2.getRefreshRate()) {
            return false;
        }
        return true;
    }

    public DisplayMode createDisplayMode(int w, int h) {
        DisplayMode dispMode = new DisplayMode(w, h, DisplayMode.BIT_DEPTH_MULTI, DisplayMode.REFRESH_RATE_UNKNOWN);
        return dispMode;
    }

    public DisplayMode createDisplayMode(int w, int h, int b) {
        DisplayMode dispMode = new DisplayMode(w, h, b, DisplayMode.REFRESH_RATE_UNKNOWN);
        return dispMode;
    }

    public DisplayMode createDisplayMode(int w, int h, int b, int r) {
        DisplayMode dispMode = new DisplayMode(w, h, b, r);
        return dispMode;
    }

    public String displayModeToString(DisplayMode displayMode) {
        return displayMode.getWidth() + "x" + displayMode.getHeight() + "x"
                + displayMode.getBitDepth() + "x" + displayMode.getRefreshRate();
    }

    public String[] displayModeToStringArray(DisplayMode displayMode) {
        String s = displayModeToString(displayMode);
        String[] aux = s.split("x");
        return aux;
    }

    public int[] displayModeToIntArray(DisplayMode displayMode) {
        String[] aux = displayModeToStringArray(displayMode);
        int display[] = new int[aux.length];
        for (int i = 0; i < aux.length; i++) {
            display[i] = Integer.parseInt(aux[i]);
        }
        return display;
    }
}