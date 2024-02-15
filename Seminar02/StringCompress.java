// 📌 Напишите метод, который сжимает строку.
// 📌 Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

package Seminar02;

// public class CompressString {

//     public static void main(String[] args) {
//         String str = "aaaabbbcdd";
//     }

//     public static void CompressString (String str) {
//         StringBuilder result = new StringBuilder();
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {

//         }
//     }
// }


public class StringCompress {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(stringCompress(str));
    }

    public static String stringCompress(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char stepArr = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == stepArr) {
                count++;
            } else {
                result.append(stepArr).append(count);
                stepArr = str.charAt(i);
                count = 1;
            }

        }
        result.append(stepArr).append(count);
        return result.toString();

    }
}