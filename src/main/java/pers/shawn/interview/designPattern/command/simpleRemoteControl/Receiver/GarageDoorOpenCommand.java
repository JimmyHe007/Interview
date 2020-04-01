package pers.shawn.interview.designPattern.command.simpleRemoteControl.Receiver;

import pers.shawn.interview.designPattern.command.simpleRemoteControl.bean.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
