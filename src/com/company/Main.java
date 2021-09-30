package com.company;

import Animal.*;
import Food.*;
import sun.management.CompilerThreadStat;


public class Main {

    public static void main(String[] args) {
        Zebra zeb = new Zebra();
        Wolf wolf = new Wolf();
        Beef beef = new Beef();
        Apple ap = new Apple();
        Seaweed sea = new Seaweed();
        Mutton mot = new Mutton();
        Worker wrk = new Worker();
        wrk.feed(zeb,ap);
        wrk.feed(zeb,mot);
        wrk.feed(wolf,mot);
        wrk.feed(zeb,mot);
        wrk.feed(zeb,ap);
        System.out.println(wrk.getVoice(wolf));
        System.out.println();
        Swim[] sw = new Swim[2];
        sw[0] = new Som();
        sw[1] = new Duck();
        for(int i = 0;i< sw.length;i++){
            sw[i].swim();
        }
}
}
