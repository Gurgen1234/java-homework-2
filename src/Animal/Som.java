package Animal;

public class Som extends Сarnivorous implements Swim{
    private String name = "Сом";
    public String getName() {
        return name;
    }
    @Override
    public void swim() {
        System.out.println("Сом плавает");
    }
}
