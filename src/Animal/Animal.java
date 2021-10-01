package Animal;

import Food.*;
import com.company.WrongFoodException;
import com.company.volierSize;

public abstract class Animal {
    private int golod;
    private volierSize size;
    private String name;
    public void eat(Animal animal, Food food) throws WrongFoodException {
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
    public volierSize getSize(){
        return size;
    }

    public String setName(Animal animal) {
        animal.name = animal.getName();
        return name;
    }
}



