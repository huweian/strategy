package com.mashibing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Dog[] d = {new Dog(1),new Dog(3),new Dog(2)};
        Sorter<Dog> sorter = new Sorter<>();
        sorter.sort(d,new DogComparator());
        System.out.println(Arrays.toString(d));

    }
}
