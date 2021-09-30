package Animal;

public class Lion extends Сarnivorous implements Run,Voice {
    private String name = "лев";
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Лев бегает");
    }

    @Override
    public String voice() {
        return "Рыыыык";
    }
}

