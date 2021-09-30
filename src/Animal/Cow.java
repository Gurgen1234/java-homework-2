package Animal;

public class Cow extends Herbivore implements Run, Voice{
    private String name = "Корова";
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Корова бегает");
    }

    @Override
    public String voice() {
        return "Мууу";
    }
}

