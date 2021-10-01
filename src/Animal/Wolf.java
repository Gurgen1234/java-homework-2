package Animal;

import com.company.volierSize;

import java.util.Objects;

public class Wolf extends Сarnivorous implements Run, Voice {
    private String name;
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Волк бегает");
    }

    public Wolf(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Objects.equals(name, wolf.name);
    }
    private volierSize size = volierSize.m;
    @Override
    public volierSize getSize() {
        return size;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String voice() {
        return "Вуууу";
    }
}
