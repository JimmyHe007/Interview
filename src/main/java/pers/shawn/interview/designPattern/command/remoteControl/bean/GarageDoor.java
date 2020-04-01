package pers.shawn.interview.designPattern.command.remoteControl.bean;

public class GarageDoor {

    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + " GarageDoor is up");
    }

    public void down() {
        System.out.println(name + " GarageDoor is down");
    }

}
