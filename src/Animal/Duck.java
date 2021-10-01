package Animal;

import com.company.volierSize;

import java.util.Objects;

public class Duck extends Herbivore implements Fly, Swim, Voice {
    private String name;
    public String getName() {
        return name;
    }
    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
    public Duck(String name){
        this.name = name;
    }
    @Override
    public String voice() {

        return "Кря кря";
    }
    private volierSize size = volierSize.s;

    @Override
    public volierSize getSize() {
        return size;
    }

    @Override

    public void fly(){
        System.out.println("Утка летает");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(name, duck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
