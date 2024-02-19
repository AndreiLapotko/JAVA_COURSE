/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 до 500
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
 */

package Seminar06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Uniq {
    public static void main(String[] args) {
        int[] arr =  getArray(1000, 500);
        System.out.println(getPersentUniq(arr));
        
    }

    public static int [] getArray(int size, int max) {
        int [] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max);   
        }
        return array;
    }
    
    public static double getPersentUniq ( int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int elem : arr) {
            set.add(elem);    
        }
        double res = (double)set.size() * 100 / arr.length;
        return res;

    }

}
