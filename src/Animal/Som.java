package Animal;

import com.company.volierSize;

import java.util.Objects;

public class Som extends Сarnivorous implements Swim{
    private String name;
    public String getName() {
        return name;
    }
    public Som(String name){
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println("Сом плавает");
    }
    private volierSize size = volierSize.s;

    @Override
    public volierSize getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Som som = (Som) o;
        return Objects.equals(name, som.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
