package pers.shawn.interview.designPattern.command.simpleRemoteControl.Invoker;

import pers.shawn.interview.designPattern.command.simpleRemoteControl.Receiver.Command;

public class SimpleRemoteControl {

    Command command;

    public void buttonWasPressed() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
