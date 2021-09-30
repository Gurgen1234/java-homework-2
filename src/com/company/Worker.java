package com.company;
import Animal.*;
import Food.*;

 class Worker{
    public void feed(Animal animal, Food food)  {
        animal.eat(animal,food);
    }

    public String getVoice (Voice voice){
        return voice.voice();
    }
}
