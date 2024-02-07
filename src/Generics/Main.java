package Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*Printer<Integer> printer = new Printer<>(10);
        printer.print();*/



       /* shout("Ivan", 10);
        shout(10, "sadas");
        shout(10.2, true);*/


        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        printList(ints);

        List<String> strings = new ArrayList<>();
        printList(strings);

    }

    /*public static<T, V> T shout(T thingToShout, V secondThingToShout){
        System.out.println(thingToShout + " " + secondThingToShout + "!!!");
        return thingToShout;
    }*/

    public static void printList(List<?> myList){
        System.out.println(myList);
    }
}