package designPattern.command.remoteControl.receiver;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand");
    }
}
