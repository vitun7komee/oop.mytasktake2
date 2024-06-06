package com.example;
import java.util.List;

class RemoteControl {
    
    private ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    
    private List<ICommand> commands;

    public void setCommands(List<ICommand> commands) {
        this.commands = commands;
    }
    public void pressAllButtons() {
        for (ICommand command : commands) {
            command.execute();
        }
    }


}
