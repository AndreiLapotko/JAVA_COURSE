// 📌 Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.


package Seminar02;

import java.io.FileWriter;

public class GenerateStrings {
    public static void main(String[] args) {
        String word = "TEST";
        String text = repeatWord(word, 100);
        System.out.println(text);
        stringToFile(text, "Test.txt");
    }
    
    public static String repeatWord(String word, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    public static void stringToFile(String str, String name) {
        try (FileWriter fw = new FileWriter(name, false)){
            fw.write(str);
            // fw.append('\n');
            // fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
