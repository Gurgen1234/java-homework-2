package com.company;

import Animal.*;
import Food.*;


public class Main {

    public static void main(String[] args){
            Zebra zeb = new Zebra("Зебра");
            Zebra zeb1 = new Zebra("Зёбра");
            Wolf wolf = new Wolf("Волчок");
            Beef beef = new Beef();
            Apple ap = new Apple();
            Seaweed sea = new Seaweed();
            Mutton mot = new Mutton();
            Worker wrk = new Worker();
            wrk.feed(zeb, mot);
            Volier<Animal> herbivoreVolier = new Volier<Animal>(volierSize.m);
            Volier<Animal> herbivoreVolier1 = new Volier<Animal>(volierSize.s);
            herbivoreVolier.add(zeb);
            herbivoreVolier.add(zeb1);
            herbivoreVolier1.add(zeb1);
            herbivoreVolier.remove("Зёбра");
            System.out.println(herbivoreVolier.get("Зёбра"));
            System.out.println(herbivoreVolier.get("Зебра"));

}
}
