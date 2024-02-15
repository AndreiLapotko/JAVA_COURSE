package Seminar01;
//📌 Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// 📌 Если общего префикса нет, вернуть пустую строку "".
public class MaxLength {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String pref = getPrefix(strs);
        System.out.println(pref);
    }

    private static String getPrefix(String[] strs) {
        String pref = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pref) != 0){
                pref = pref.substring(0, pref.length()-1);
                if (pref.isEmpty()) return pref;
            }
            
        }
        return pref;
    }
}
