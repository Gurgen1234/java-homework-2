package Animal;

import Food.*;

public abstract class Сarnivorous extends Animal {
        public void eat(Animal animal, Food food) {
            if (food instanceof Meat) {
                super.eat(animal, food);
                System.out.println("Ням " + animal.setName(animal) + " голод был " + (animal.getGolod() - 3) + " стал " + animal.getGolod());            }
            else {
                System.out.println(animal.setName(animal) + " Смотрит с недовольным лицом");
            }
        }
    }
