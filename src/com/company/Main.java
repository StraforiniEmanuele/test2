package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Calcolo calcolo = new Calcolo();

        /*for (int i = 1; i<10000; i++) {
            System.out.println("Numero in questione: " + i);
            calcolo.calcolo(i);
        }

        System.out.println(calcolo.toString());
        calcolo.alberoDiNatale(9);*/
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("ab");
        strings.stream()
                .filter(s -> s.charAt(0)=='a')
                 .forEach(System.out::println);
    }
}
