package br.com.schumaker.gof.behavioral.command.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 14/09/2014
 */
public class IncreaseVolumeCommand implements Command {

    private Player player;
    private int level;

    public IncreaseVolumeCommand(Player player, int level) {
        this.player = player;
        this.level = level;
    }

    @Override
    public void execute() {
        player.increaseVolume(level);
    }
}
