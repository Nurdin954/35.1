package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> book = new ArrayList<>(Arrays.asList("Black_Cover", "Gravity_falls", "Extraordinary", "Naruto", "Boruto"));
        System.out.println(book);
        System.out.println("----------------------------");
        book.remove("Boruto");
        System.out.println(book);
        System.out.println("----------------------------");
        book.add("Transformer");
        System.out.println(book);
        System.out.println(book.get(4));
        System.out.println("----------------------------");
        book.clear();
        System.out.println(book);
        System.out.println("----------------------------");
        book.add("Bakugan");
        book.add("Beyblade");
        book.add("Minecraft");
        System.out.println(book);
        System.out.println("----------------------------");


        LinkedList<String> book2 = new LinkedList<>(book);
        System.out.println(book2);
        System.out.println("----------------------------");
        book2.addFirst("Famaly");
        book2.addFirst("Famaly");
        System.out.println(book2);
        System.out.println("----------------------------");
        book2.addLast("Sword_Art_Online");
        book2.addLast("Sword_Art_Online");
        System.out.println(book2);
        System.out.println("----------------------------");
        book2.removeFirstOccurrence("Famaly");
        System.out.println(book2);
        System.out.println("----------------------------");
        book2.removeLastOccurrence("Sword_Art_Online");
        System.out.println(book2);

    }
}
