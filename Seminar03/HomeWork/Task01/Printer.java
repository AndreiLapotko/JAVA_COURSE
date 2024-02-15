/*
Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
Пример
a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */

package Seminar03.HomeWork.Task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        List<Integer> unsortedList = new ArrayList<>();
        for (int i : a) {
            unsortedList.add(i);
        }
        Integer[] b = new Integer[a.length];
        unsortedList = sortingList(unsortedList);
        unsortedList.toArray(b);
        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
            // System.out.println(((Object)a[i]).getClass().getName());
        }
        return a;
    }
    public static List <Integer> sortingList(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            Integer base = list.get(0);
            List<Integer> low = new ArrayList<>();
            List<Integer> high = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= base) {
                    low.add(list.get(i));
                } else {
                    high.add(list.get(i));
                }
            }
            List<Integer> result = new ArrayList<>();
            result.addAll(sortingList(low));
            result.add(base);
            result.addAll(sortingList(high));
            return result;

            // low.add(base);
            // low.addAll(sortingList(high));
            // return low;

        }
    }
}



    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[] { 5, 1, 6, 2, 3, 4 };
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}