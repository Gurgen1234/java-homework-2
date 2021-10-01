package Animal;

import com.company.volierSize;

import java.util.Objects;

public class Zebra extends Herbivore implements Run, Voice {
    private String name;
    public String getName() {
        return name;
    }
    public Zebra(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Зебра бегает");
    }
    @Override
    public String voice() {
        return "Игого";
    }
    private volierSize size = volierSize.m;
    @Override
    public volierSize getSize() {
        return size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zebra zebra = (Zebra) o;
        return Objects.equals(name, zebra.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
