package Lesson_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex001 {
    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length;

        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    static int[] AddItemToCenterArray(int[] array, int item) {
        int length = array.length;
        int newLength = length + 1;
        int center = newLength / 2;

        int[] temp = new int[newLength];
        System.arraycopy(array, 0, temp, 0, center);
        temp[center] = item;
        for (int i = center + 1; i < newLength; i++) {
            temp[i] = array[i - 1];
        }
        return temp;
    }

    static int[] AddItemToCenterArrayByList(int[] array, int item) {
        int length = array.length;
        int newLength = length + 1;
        int center = newLength / 2;
        ArrayList<Integer> list = new ArrayList<>(newLength);

        // int[] temp = new int[newLength];
        System.arraycopy(array, 0, temp, 0, center);
        temp[center] = item;
        for (int i = center + 1; i < newLength; i++) {
            temp[i] = array[i - 1];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] a = new int[10000000];
        // for (int i : a) {
        //     System.out.printf("%d ", i);
        // }
        long start = System.currentTimeMillis();
        // a = AddItemToCenterArray(a, 999);
        a = AddItemInArray(a, 999);
        System.out.println(System.currentTimeMillis() - start);
        // a = AddItemToCenterArray(a, 111);
        // a = AddItemToCenterArray(a, 1111);
        // System.out.println();
        // for (int j : a) {
        //     System.out.printf("%d ", j);
        // }
        // System.out.println();
    }
}