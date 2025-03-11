public class LegniCommand implements Command {
    private Trainee trainee;

    public LegniCommand(Trainee trainee) {
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        trainee.changePosition("легни");
    }
}
