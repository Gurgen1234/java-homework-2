package com.company;



import Animal.Animal;

import java.util.HashMap;
import java.util.Map;

public class Volier<E extends Animal>{
    private volierSize volierSize;
    public Volier(volierSize v){
        this.volierSize = v;
    }
    private static Map<String, Animal> volier = new HashMap<String, Animal>();
    public void add(E animal){
        if(animal.getSize() == volierSize){
        volier.put(animal.getName(), animal);
        }
        else {
            System.out.println("Размер не подходит");
        }
    }
    public Animal get(String name){
        return volier.get(name);
    }
    public Animal remove(String name){
        return volier.remove(name);
    }
}
