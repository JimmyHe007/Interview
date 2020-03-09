package DesignPattern.CommandPattern.SimpleRemoteControl;

import DesignPattern.CommandPattern.SimpleRemoteControl.Invoker.SimpleRemoteControl;
import DesignPattern.CommandPattern.SimpleRemoteControl.Receiver.Command;
import DesignPattern.CommandPattern.SimpleRemoteControl.Receiver.GarageDoorOpenCommand;
import DesignPattern.CommandPattern.SimpleRemoteControl.Receiver.LightOnCommand;
import DesignPattern.CommandPattern.SimpleRemoteControl.bean.GarageDoor;
import DesignPattern.CommandPattern.SimpleRemoteControl.bean.Light;

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
