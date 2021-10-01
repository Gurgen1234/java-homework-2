package Animal;

import Food.*;
import com.company.WrongFoodException;

public abstract class Сarnivorous extends Animal {
        public void eat(Animal animal, Food food) throws WrongFoodException {
            if (food instanceof Meat) {
                super.eat(animal, food);
                System.out.println("Ням " + animal.setName(animal) + " голод был " + (animal.getGolod() - 3) + " стал " + animal.getGolod());            }
            else {
                throw new WrongFoodException(animal.getName() + " Смотрит недовльно");
            }
        }
    }
