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
            Volier<Herbivore> herbivoreVolier = new Volier<Herbivore>(volierSize.m);
            Volier<Сarnivorous> herbivoreVolier1 = new Volier<Сarnivorous>(volierSize.s);
            System.out.println(zeb);
            //herbivoreVolier.add(wolf); Выдает ошибку
            herbivoreVolier.add(zeb1);
            herbivoreVolier.add(zeb );
            //herbivoreVolier1.add(zeb);
            herbivoreVolier.remove("Зёбра");
            Zebra zebr = (Zebra) herbivoreVolier.get("Зебра");


}
}
