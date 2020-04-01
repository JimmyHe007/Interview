package pers.shawn.interview.designPattern.command.remoteControl.receiver;

import pers.shawn.interview.designPattern.command.remoteControl.bean.Light;

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
