package br.com.schumaker.hs.manager;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Port;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Hudson Schumaker
 * @version 1.3.4
 * @since 2013 Java 6 port
 */
public class SoundManager implements Runnable {

    private String name;
    private int times = 0;
    private float volume = 0.3f;
    private float balance = 0.0f;
    private Clip clip;
    private Thread thread;

    public SoundManager() {
    }

    public SoundManager(String name) {
        this.name = name;
    }

    public SoundManager(String name, int times) {
        this.name = name;
        this.times = times;
    }

    public SoundManager(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    public SoundManager(String name, float volume, float balance) {
        this.name = name;
        this.volume = volume;
        this.balance = balance;
    }

    public SoundManager(String name, int times, float volume) {
        this.name = name;
        this.times = times;
        this.volume = volume;
    }

    public SoundManager(String name, int times, float volume, float balance) {
        this.name = name;
        this.times = times;
        this.volume = volume;
        this.balance = balance;
    }

    public void start() {
        thread = new Thread(this);
        thread.setPriority(10);
        thread.start();
    }

    public void stop() {
        thread = null;
        clip.stop();
    }

    @Override
    public void run() {
        try {
            Mixer.Info[] infos = AudioSystem.getMixerInfo();
            for (Mixer.Info info : infos) {
                Mixer mixer = AudioSystem.getMixer(info);
                if (mixer.isLineSupported(Port.Info.SPEAKER)) {
                    Port port = (Port) mixer.getLine(Port.Info.SPEAKER);
                    port.open();
                    if (port.isControlSupported(FloatControl.Type.VOLUME)) {
                        FloatControl volumeControl = (FloatControl) port.getControl(FloatControl.Type.VOLUME);
                        volumeControl.setValue(getVolume());
                    }
                    if (port.isControlSupported(FloatControl.Type.BALANCE)) {
                        FloatControl balanceControl = (FloatControl) port.getControl(FloatControl.Type.BALANCE);
                        balanceControl.setValue(getBalance());
                    }
                    port.close();
                }
            }
            URL url = this.getClass().getClassLoader().getResource("res/audio/" + getName());
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(getTimes());
            clip.start();
        } catch (UnsupportedAudioFileException e) {
        } catch (LineUnavailableException e) {
        } catch (IOException e) {
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}