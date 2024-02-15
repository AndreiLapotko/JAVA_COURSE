/*
 * Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.
 */

package Seminar03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("Жанр 1", "Книга1", "Книга2", "Книга3"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("Жанр 2", "Книга1", "Книга2", "Книга3"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("Жанр 3", "Книга1", "Книга2", "Книга3"));
        catalog.add(genre1);
        catalog.add(genre2);
        catalog.add(genre3);
        for ( ArrayList<String> genre : catalog) {
            System.out.println(genre);
        }   
    }
}