package pers.shawn.interview.designPattern.compound.mvc.djview;

import pers.shawn.interview.designPattern.compound.mvc.djview.controller.BeatController;
import pers.shawn.interview.designPattern.compound.mvc.djview.controller.ControllerInterface;
import pers.shawn.interview.designPattern.compound.mvc.djview.model.BeatModel;
import pers.shawn.interview.designPattern.compound.mvc.djview.model.BeatModelInterface;

/**
 * Test class
 *
 * @author hx
 * @module
 * @since 2020/4/16
 */
public class Test {

    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }

}
