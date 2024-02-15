package Seminar01;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

// import javax.swing.MultiUIDefaults.MultiUIDefaultsEnumerator.Type;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // System.out.println(LocalDateTime.now());
        System.out.println(LocalTime.now());


//         📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

        Scanner iScanner = new Scanner(System.in, "ibm866");

        System.out.printf("name: ");
        String name = iScanner.nextLine();
        iScanner.close();
        LocalTime time = LocalTime.now();
        LocalTime morningBegin = LocalTime.parse("05:00");
        

        if (time.isAfter(morningBegin) && time.isBefore(LocalTime.parse("11:59"))) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (time.isAfter(LocalTime.parse("12:00")) && time.isBefore(LocalTime.parse("17:59"))) {
            System.out.printf("Добрый день, %s!", name);
        } else if (time.isAfter(LocalTime.parse("18:00")) && time.isBefore(LocalTime.parse("22:59"))) {
            System.out.printf("Добрый вечер, %s!", name);
        } else {
            System.out.printf("Доброй ночи, %s!", name);
        }        
    }
}