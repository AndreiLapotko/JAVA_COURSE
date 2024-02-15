/*
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */

package Seminar04;

import java.util.Arrays;

public class MyStack {
    private static int[] arr;
    private static int size;
    private static int indexUp;

    public static void main(String[] args) {
        size = 5;
        indexUp = -1;
        arr = new int[size];

        System.out.println(size());
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);
        push(7);
        push(8);
        push(9);
        push(10);
        push(11);
        System.out.println(size());
        System.out.println(pop());
        System.out.println(size());
        push(20);
        System.out.println(Arrays.toString(arr));
        printStack();
    }

    public static int size() {
        return indexUp + 1;
    }

    public static boolean empty() {
        return indexUp == -1;
    }

    public static void push(int num) {
        if (indexUp == size - 1){
            extendArr();
        }
        arr[++indexUp] = num;
    }

    public static int peek() {
        return arr[indexUp];
    }

    public static int pop() {
        return arr[indexUp--];
    }

    public static void extendArr() {
        size += 5;
        int[] temp = new int[size];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp.clone();
    }

    public static void printStack() {
        for (int i = indexUp; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
