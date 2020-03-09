package DesignPattern.CommandPattern.RemoteControl.Receiver;

import DesignPattern.CommandPattern.RemoteControl.bean.GarageDoor;

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
