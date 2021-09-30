package Animal;

public class Wolf extends Сarnivorous implements Run, Voice {
    private String name = "Волк";
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Волк бегает");
    }

    @Override
    public String voice() {
        return "Вууууууууууууу";
    }
}
