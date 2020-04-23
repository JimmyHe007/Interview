package pers.shawn.interview.designPattern.compound.mvc.djview.model;

import pers.shawn.interview.designPattern.compound.mvc.djview.observer.BPMObserver;
import pers.shawn.interview.designPattern.compound.mvc.djview.observer.BeatObserver;

/**
 * BeatModelInterface class
 *
 * @author hx
 * @module
 * @since 2020/4/16
 */
public interface BeatModelInterface {

    void initialize();
    void on();
    void off();
    void setBPM(int bpm);
    int getBPM();
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);

}
