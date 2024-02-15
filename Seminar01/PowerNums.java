/*
Реализовать функцию возведения числа а в степень b. 
a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */

package Seminar01;

public class PowerNums {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(powNums(a, b));
    }

    public static double powNums(int m, int n) {
        if (n < 0)
            return 1 / powNums(m, -n);
        if (n == 0)
            return 1.0;
        else {
            return m * powNums(m, n - 1);
        }
    }
}
