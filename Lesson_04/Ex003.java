package Lesson_04;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque.removeLast());
        deque.removeLast();
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque);
        deque.pollFirst();
        deque.pollLast();
        deque.getFirst();
        deque.getLast();
        deque.peekFirst();
        deque.peekLast();
        System.out.println(deque);
    }
}