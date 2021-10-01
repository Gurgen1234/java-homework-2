package com.company;
import Animal.*;
import Food.*;

 class Worker{
    public void feed(Animal animal, Food food){
        try {
            animal.eat(animal,food);
        }
        catch (WrongFoodException e) {
            e.printStackTrace();
        }

    }

    public String getVoice (Voice voice){
        return voice.voice();
    }
}
