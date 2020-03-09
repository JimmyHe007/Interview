package DesignPattern.CommandPattern.RemoteControl.Receiver;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand");
    }
}
