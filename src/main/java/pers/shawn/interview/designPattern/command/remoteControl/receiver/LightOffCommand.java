package pers.shawn.interview.designPattern.command.remoteControl.receiver;

import pers.shawn.interview.designPattern.command.remoteControl.bean.Light;

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
