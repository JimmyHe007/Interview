package designPattern.command.simpleRemoteControl.Invoker;

import designPattern.command.simpleRemoteControl.Receiver.Command;

public class SimpleRemoteControl {

    Command command;

    public void buttonWasPressed() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
