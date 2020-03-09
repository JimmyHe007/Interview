package DesignPattern.CommandPattern.RemoteControl.Receiver;

import DesignPattern.CommandPattern.RemoteControl.bean.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
