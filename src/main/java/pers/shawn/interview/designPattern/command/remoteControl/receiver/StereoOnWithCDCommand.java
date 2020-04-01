package pers.shawn.interview.designPattern.command.remoteControl.receiver;

import pers.shawn.interview.designPattern.command.remoteControl.bean.Stereo;

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
