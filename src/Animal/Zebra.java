package Animal;

public class Zebra extends Herbivore implements Run, Voice {
    private String name = "Зебра";
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Зебра бегает");
    }
    @Override
    public String voice() {
        return "Игого";
    }
}
