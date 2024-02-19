/*
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */


package Seminar06;

import java.util.HashSet;
import java.util.Set;

public class CatMain {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 2, "Серый");
        Cat cat2 = new Cat("Васька", 1, "Чёрный");
        Cat cat3 = new Cat("Мурка", 3, "Белый");
        Cat cat4 = new Cat("Мурка", 3, "Белый");
        Cat cat5 = new Cat("Мурка", 3, "Белый");

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        set.add(cat5);

        for (Cat cat : set) {
            System.out.println(cat);
            System.out.println();
        }
    }
}
