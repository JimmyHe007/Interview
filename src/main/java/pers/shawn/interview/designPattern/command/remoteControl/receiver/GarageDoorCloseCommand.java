package pers.shawn.interview.designPattern.command.remoteControl.receiver;

import pers.shawn.interview.designPattern.command.remoteControl.bean.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
