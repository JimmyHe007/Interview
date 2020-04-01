package pers.shawn.interview.designPattern.command.simpleRemoteControl;

import pers.shawn.interview.designPattern.command.simpleRemoteControl.Invoker.SimpleRemoteControl;
import pers.shawn.interview.designPattern.command.simpleRemoteControl.Receiver.Command;
import pers.shawn.interview.designPattern.command.simpleRemoteControl.Receiver.GarageDoorOpenCommand;
import pers.shawn.interview.designPattern.command.simpleRemoteControl.Receiver.LightOnCommand;
import pers.shawn.interview.designPattern.command.simpleRemoteControl.bean.GarageDoor;
import pers.shawn.interview.designPattern.command.simpleRemoteControl.bean.Light;

public class Test {

    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();

        Light light = new Light();
        Command command = new LightOnCommand(light);
        control.setCommand(command);
        control.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        command = new GarageDoorOpenCommand(garageDoor);
        control.setCommand(command);
        control.buttonWasPressed();
    }

}
