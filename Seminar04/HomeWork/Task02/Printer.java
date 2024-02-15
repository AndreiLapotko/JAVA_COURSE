/*
В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
Пример
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements()); 
Результат:
[1, 10, 15, 5]
queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
Результат:
 [15, 5]
System.out.println(queue.first());
Результат:
15
 */

package Seminar04.HomeWork.Task02;

import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    LinkedList<T> myList = new LinkedList<>();

    public void enqueue(T element) { // помещает элемент в конец очереди
        // Напишите свое решение ниже
        myList.add(element);
    }

    public T dequeue() { // возвращает первый элемент из очереди и удаляет его
        // Напишите свое решение ниже
        return myList.removeFirst();
    }

    public T first() { // возвращает первый элемент из очереди, не удаляя
        // Напишите свое решение ниже
        return myList.getFirst();

    }

    public LinkedList<T> getElements() { // возвращает все элементы в очереди
        // Напишите свое решение ниже
        return myList;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(45);
            queue.enqueue(2);
            queue.enqueue(6);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}