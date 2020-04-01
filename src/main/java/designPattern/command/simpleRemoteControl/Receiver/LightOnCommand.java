package designPattern.command.simpleRemoteControl.Receiver;

import designPattern.command.simpleRemoteControl.bean.Light;

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
