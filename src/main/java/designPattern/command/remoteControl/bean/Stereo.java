package designPattern.command.remoteControl.bean;

public class Stereo {

    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void setCD() {
        System.out.println(name + " Stereo is setCD");
    }

    public void setVolume(int x) {
        System.out.println(name + " Stereo is setVolume to " + x);
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

}
