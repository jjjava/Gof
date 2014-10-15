package br.com.schumaker.gof.behavioral.command.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 14/09/2014
 */
public class PlayMusicCommnad implements Command {
    
    private Player player;
    private String fileName;
    
    public PlayMusicCommnad(Player player, String fileName) {
        this.player = player;
        this.fileName = fileName;
    }
    
    @Override
    public void execute() {
        player.play(fileName);
    }
}
