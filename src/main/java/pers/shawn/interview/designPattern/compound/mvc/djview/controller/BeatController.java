package pers.shawn.interview.designPattern.compound.mvc.djview.controller;

import pers.shawn.interview.designPattern.compound.mvc.djview.model.BeatModelInterface;
import pers.shawn.interview.designPattern.compound.mvc.djview.view.DJView;

/**
 * BeatController class
 *
 * @author hx
 * @module
 * @since 2020/4/16
 */
public class BeatController implements ControllerInterface {

    BeatModelInterface model;
    DJView djView;

    public BeatController(BeatModelInterface model) {
        this.model = model;
        djView = new DJView(this, model);
        djView.createView();
        djView.createControls();
        djView.disableStopMenuItem();
        djView.enableStartMenuItem();
        model.initialize();
    }

    @Override
    public void start() {
        model.on();
        djView.disableStartMenuItem();
        djView.enableStopMenuItem();
    }

    @Override
    public void stop() {
        model.off();
        djView.disableStopMenuItem();
        djView.enableStartMenuItem();
    }

    @Override
    public void increaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm+1);
    }

    @Override
    public void decreaseBPM() {
        int bpm = model.getBPM();
        model.setBPM(bpm-1);
    }

    @Override
    public void setBPM(int bpm) {
        model.setBPM(bpm);
    }
}
