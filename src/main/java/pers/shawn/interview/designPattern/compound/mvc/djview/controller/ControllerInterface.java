package pers.shawn.interview.designPattern.compound.mvc.djview.controller;

/**
 * ControllerInterface class
 *
 * @author hx
 * @module
 * @since 2020/4/16
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);

}
