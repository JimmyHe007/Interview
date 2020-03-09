package DesignPattern.CommandPattern.RemoteControl.Receiver;

import DesignPattern.CommandPattern.RemoteControl.bean.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
}
