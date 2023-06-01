package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;

public class Iteradores {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hola");
        arrayList.add("Q");
        arrayList.add("Tal");
        arrayList.add("!");
        arrayList.remove("Hola");
        arrayList.remove(0);
        arrayList.toString();

        Iterator<String> it = arrayList.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (String i : arrayList) {
            i.concat(" !"); // immutable
        }

        System.out.println(arrayList.toString());
    }
}
