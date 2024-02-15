// Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.
// Пример
// 2
// 3
// 5
// 7
// 11
// ...


package Seminar01.HomeWork.Task02;

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            if (i > 3 && i % 2 == 0 && i % 3 == 0) continue;
            for (int j = i / 2; j >= 1 ; j--) {
                if (i % j == 0) count++;
            }
            if (count < 2) System.out.println(i);
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}