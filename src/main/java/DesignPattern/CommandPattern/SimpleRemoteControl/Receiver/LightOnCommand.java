package DesignPattern.CommandPattern.SimpleRemoteControl.Receiver;

import DesignPattern.CommandPattern.SimpleRemoteControl.bean.Light;

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
