package br.com.schumaker.gof.behavioral.command.example1;

import java.util.ArrayList;

/**
 * @author Hudson Schumaker
 * @version 1.0.0
 * @since 14/09/2014
 */
public class CommandList {

    private ArrayList<Command> commnads;

    public CommandList() {
        commnads = new ArrayList<>();
    }
    
    public void addCommand(Command command){
        commnads.add(command);
    }

    public void executeCommands() {
        for(Command c : commnads){
            c.execute();
        }
    }
}
