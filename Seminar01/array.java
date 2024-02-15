package Seminar01;
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.
public class array {
    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 };
        int max = getMaxOnes(array);
        System.out.println(max);
    }

    private static int getMaxOnes(int[] array) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                // if (count > max) {
                //     max = count;
                // }
                max = count > max ? count : max;
            } else
                count = 0;
        }
        return max;
    }
}
