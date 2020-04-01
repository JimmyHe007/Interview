package pers.shawn.interview.designPattern.command.remoteControl.invoker;

import pers.shawn.interview.designPattern.command.remoteControl.receiver.Command;
import pers.shawn.interview.designPattern.command.remoteControl.receiver.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------Remote Control------\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot " +i +"] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return buffer.toString();
    }
}
