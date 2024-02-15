/*
 * Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */

package Seminar01;

public class ReversedWords {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        System.out.println(str);
        reversWords(str);
    }

    private static void reversWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (i == 0) {
                sb.append(words[i]);
            } else
                sb.append(words[i]).append(" ");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
