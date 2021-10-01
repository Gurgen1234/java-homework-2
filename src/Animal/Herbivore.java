package Animal;


import Food.*;
import com.company.WrongFoodException;

public abstract class Herbivore extends Animal {
    public void eat(Animal animal, Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            super.eat(animal, food);
            System.out.println("Ням " + animal.setName(animal) + " голод был " + (animal.getGolod() - 3) + " стал " + animal.getGolod());            }
        else {
            throw new WrongFoodException(animal.getName() + " Смотрит недовльно");
        }
    }
}

