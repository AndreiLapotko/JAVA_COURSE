/*
В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)
// 10.0
// 11.0
// 10.0
calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)
// 6.0
// 3.0
// 6.0
 */

package Seminar04.HomeWork.Task03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class Calculator {
    // public Deque<Double> stack = new ArrayDeque();
    Stack<Double> stack = new Stack<>();
    // public int calculate(char op, int a, int b) {
    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        double result = 0;
        
        switch (op) {
            case '+':
                result = sum(a, b);
                // stack.push(result);
                // System.out.println(stack);
                break;
            case '-':
                result = minus(a, b);
                // stack.push(result);
                break;
            case '*':
                result = mult(a, b);
                // stack.push(result);
                break;
            case '/':
                result = div(a, b);
                // stack.push(result);
                break;
            case '<':
                // stack.pollLast();
                stack.pop();
                // result = stack.pollLast();
                result = stack.pop();
                break;
            default:
                System.out.println("Некорректный оператор: " + op);
                break;
        }
        // stack.addLast(result);
        stack.push(result);
        return result;
    }

    private int sum(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private double div(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        }
        return -1;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        // int result = calculator.calculate(op, a, b);
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        // int result2 = calculator.calculate(op2, c, d);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        // int prevResult = calculator.calculate(undo, 0, 0);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}