package Animal;

import com.company.volierSize;

import java.util.Objects;

public class Lion extends Сarnivorous implements Run,Voice {
    private String name;
    public String getName() {
        return name;
    }
    @Override
    public void run() {
        System.out.println("Лев бегает");
    }
    private volierSize size = volierSize.l;

    @Override
    public volierSize getSize() {
        return size;
    }

    @Override
    public String voice() {
        return "Рыыыык";
    }
    public Lion(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lion lion = (Lion) o;
        return Objects.equals(name, lion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

