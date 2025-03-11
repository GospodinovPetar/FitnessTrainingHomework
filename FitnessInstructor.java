public class FitnessInstructor {
    private Trainee trainee;

    public FitnessInstructor(Trainee trainee) {
        this.trainee = trainee;
    }

    public void performExercise(Command command) {
        command.execute();
    }
}
