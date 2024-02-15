/*
 * 📌 Создать список типа ArrayList<String>.
📌 Поместить в него как строки, так и целые числа.
📌 Пройти по списку, найти и удалить целые числа.
 */

package Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveInteger {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("df", "12", "12", "12", "df", "7", "kdf", "45"));

        System.out.println(list);
        removeNumber(list);
        System.out.println(list);
    }

    private static void removeNumber(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            if (isNumber(elem)) {
                iterator.remove();
            }
        }
    }

    private static boolean isNumber(String elem) {
        try {
            Integer.parseInt(elem);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
