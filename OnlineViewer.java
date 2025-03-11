public class OnlineViewer implements Observer {
    private String name;

    public OnlineViewer(String name) {
        this.name = name;
    }

    @Override
    public void update(String position) {
        System.out.println(name + ": Получих известие да сменя позицията към " + position);
    }
}
