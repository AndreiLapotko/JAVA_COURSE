package Seminar04;

import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll.size());
        ll.add(1);
        System.out.println(ll.size());
        System.out.println(ll);
        ll.add(2);
        ll.add(3);
        System.out.println(ll.size());
        System.out.println(ll);
    }
}
