package Animal;

import Food.*;

public abstract class Animal {
    private int golod;
    private String name;
    public void eat (Animal animal, Food food){
        if (animal.golod < 10){
        animal.golod += food.getPlot();
        }
        else {
            System.out.println("Наелся и спит");
        }
    }
    public int getGolod() {
        return golod;
    }

    public String getName() {
        return name;
    }

    public String setName(Animal animal) {
        animal.name = animal.getName();
        return name;
    }
}



