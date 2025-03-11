public class Main {
    public static void main(String[] args) {

        Trainee trainee = new Trainee();

        OnlineViewer viewer1 = new OnlineViewer("Viewer1");
        OnlineViewer viewer2 = new OnlineViewer("Viewer2");
        OnlineViewer viewer3 = new OnlineViewer("Viewer3");

        trainee.attach(viewer1);
        trainee.attach(viewer2);
        trainee.attach(viewer3);

        FitnessInstructor instructor = new FitnessInstructor(trainee);

        Command legniCommand = new LegniCommand(trainee);
        instructor.performExercise(legniCommand);

        Command staniCommand = new StaniCommand(trainee);
        instructor.performExercise(staniCommand);
    }
}
