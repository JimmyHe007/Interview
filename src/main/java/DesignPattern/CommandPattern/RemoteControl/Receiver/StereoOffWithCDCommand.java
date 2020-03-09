package DesignPattern.CommandPattern.RemoteControl.Receiver;

import DesignPattern.CommandPattern.RemoteControl.bean.Stereo;

public class StereoOffWithCDCommand implements Command {

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
