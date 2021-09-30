package Animal;

public class Duck extends Herbivore implements Fly, Swim, Voice {
    private String name = "Утка";
    public String getName() {
        return name;
    }
    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public String voice() {

        return "Кря кря";
    }
    @Override
    public void fly(){
        System.out.println("Утка летает");
    }
}
