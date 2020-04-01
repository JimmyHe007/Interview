package pers.shawn.interview.designPattern.command.remoteControl;

import pers.shawn.interview.designPattern.command.remoteControl.invoker.RemoteControl;
import pers.shawn.interview.designPattern.command.remoteControl.receiver.*;
import pers.shawn.interview.designPattern.command.remoteControl.bean.GarageDoor;
import pers.shawn.interview.designPattern.command.remoteControl.bean.Light;
import pers.shawn.interview.designPattern.command.remoteControl.bean.Stereo;

public class Test {

    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand livingRoomStereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand livingRoomStereoOff = new StereoOffWithCDCommand(stereo);

        control.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        control.setCommand(1, kitchenLightOn, kitchenLightOff);
        control.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        control.setCommand(3, livingRoomStereoOnWithCD, livingRoomStereoOff);

        System.out.println(control);

        control.onButtonWasPushed(0);
        control.offButtonWasPushed(0);
        control.onButtonWasPushed(1);
        control.offButtonWasPushed(1);
        control.onButtonWasPushed(2);
        control.offButtonWasPushed(2);
        control.onButtonWasPushed(3);
        control.offButtonWasPushed(3);
        control.offButtonWasPushed(4);//NoCommand
    }

}
