import java.util.HashMap;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

public class IsomorfWords {
    public static void main(String[] args) {
        String s = "note", t = "code";
        boolean res = isIsomorphic(s, t);
        System.out.println(res);
    }

    public static boolean isIsomorphic(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }
        if (strOne.equals(strTwo)) {
            return true;
        }
        HashMap<Character, Character> dict = new HashMap<>();
        for (int i = 0; i < strOne.length(); i++) {
            char one = strOne.charAt(i);
            char two = strTwo.charAt(i);
            if (dict.containsKey(one)) {
                if (dict.get(one) != two) {
                    return false;
                }
            }else if (dict.containsValue(two)) {
                return false;
            }else{
                dict.put(one, two);
            }
        }
        return true;
    }
}