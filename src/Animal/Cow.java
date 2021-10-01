package Animal;

import com.company.volierSize;

import java.util.Objects;

public class Cow extends Herbivore implements Run, Voice{
    private String name;
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Корова бегает");
    }
    public Cow(String name){
        this.name = name;
    }
    @Override
    public String voice() {
        return "Мууу";
    }
    private volierSize size = volierSize.xl;

    public volierSize getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

