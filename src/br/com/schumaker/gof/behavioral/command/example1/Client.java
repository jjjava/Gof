package br.com.schumaker.gof.behavioral.command.example1;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 14/09/2014
 */
public class Client {

    public static void main(String[] args) {
        Player player = Player.getInstance();
        
        CommandList commandList = new CommandList();
        commandList.addCommand(new IncreaseVolumeCommand(player, 5));
        commandList.addCommand(new PlayMusicCommnad(player, "The Dark Side of the Moon"));
        commandList.addCommand(new DecreaseVolumeCommand(player, 4));
        commandList.addCommand(new PlayMusicCommnad(player, "Moonlight Sonata"));
        
        commandList.executeCommands();

    }
}
