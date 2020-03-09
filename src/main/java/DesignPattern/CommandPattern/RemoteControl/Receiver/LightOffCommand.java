package DesignPattern.CommandPattern.RemoteControl.Receiver;

import DesignPattern.CommandPattern.RemoteControl.bean.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
