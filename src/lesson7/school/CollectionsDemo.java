package lesson7.school;

import lesson4.school.Cat;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        LinkedHashSet<Cat> linkedCats = new LinkedHashSet<>();
        Set<Cat> catTreeSet = new TreeSet<>();

        Cat cat4 = new Cat("kotic", 12, 9, "Slavyan", "domashnii");
        Cat cat1 = new Cat("kotic", 10, 9, "Slavyan", "domashnii");
        Cat cat2 = new Cat("kotic", 10, 9, "Slavyan", "domashnii");
        Cat cat3 = new Cat("kotic", 10, 9, "Slavyan", "domashnii");
        Cat cat5 = new Cat("kotic", 18, 9, "Slavyan", "domashnii");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);


        linkedCats.add(cat1);
        linkedCats.add(cat2);
        linkedCats.add(cat3);
        linkedCats.add(cat4);
        linkedCats.add(cat5);

        catTreeSet.add(cat1);
        catTreeSet.add(cat2);
        catTreeSet.add(cat3);
        catTreeSet.add(cat4);
        catTreeSet.add(cat5);

        System.out.println("-------------------Simple--------------");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("---------------------------------");

        System.out.println("------------------Linked---------------");
        for (Cat linkedCat : linkedCats) {
            System.out.println(linkedCat);
        }
        System.out.println("---------------------------------");

        System.out.println("------------------Tree---------------");
        for (Cat treeCat : catTreeSet) {
            System.out.println(treeCat);
        }
        System.out.println("---------------------------------");

    }
}