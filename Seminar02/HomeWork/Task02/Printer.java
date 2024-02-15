/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.

Пример

arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
 */

package Seminar02.HomeWork.Task02;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class BubbleSort {

    public static void sort(int[] mas) {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        try {
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);

            logger.setUseParentHandlers(false); // здесь запрещаем вывод логов в консоль

            fh.setFormatter(new MyFormatter());

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = mas.length - 1; i >= 0; i--) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (mas[j] > mas[j + 1]) {
                    count++;
                    int temp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = temp;
                }
            }
            if (count == 0) continue;
            logger.info(Arrays.toString(mas));
        }
        // logger.info(Arrays.toString(mas));
    }

    static class MyFormatter extends Formatter {
        public String format(LogRecord record) {
            DateTimeFormatter formDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm ");
            return formDate.format(LocalDateTime.now()) + record.getMessage() + '\n';
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}