/*
 * 📌 Заполнить список десятью случайными числами.
📌 Отсортировать список методом sort() класса Collections и вывести его на
экран.
 */

package Seminar03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        List <Integer> list = getRndListOfInteger();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static ArrayList <Integer> getRndListOfInteger() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }
}
