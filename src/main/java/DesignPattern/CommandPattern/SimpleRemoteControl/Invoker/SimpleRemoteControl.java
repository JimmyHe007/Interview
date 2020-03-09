package DesignPattern.CommandPattern.SimpleRemoteControl.Invoker;

import DesignPattern.CommandPattern.SimpleRemoteControl.Receiver.Command;

public class SimpleRemoteControl {

    Command command;

    public void buttonWasPressed() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
