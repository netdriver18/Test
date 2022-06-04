package module2.homeTask4.lists;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persons person1 = new Persons(12, "Lion");
        Persons person2 = new Persons(20, "Jack");
        Persons person3 = new Persons(50, "Jane");
        Persons person4 = new Persons(67, "Lise");
        Persons person5 = new Persons(2, "Kate");

        //TreeSet//////////////////////////////////////////////

        Set<Persons> persons = new TreeSet<>();

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);


        for (Persons p : persons
        ) {
            System.out.println(p.toString());

        }
        System.out.println("Sorted hashSet-----> treeSet///////////////////////////");

        //HashSet//////////////////////////////////////////////
        Set<Persons> per = new HashSet<>();
        ArrayList<Persons> al = new ArrayList<>();

        Persons per1 = new Persons(12, "Maria");
        Persons per2 = new Persons(20, "Katy");
        Persons per3 = new Persons(50, "Luk");
        Persons per4 = new Persons(67, "Nike");
        Persons per5 = new Persons(2, "Liz");

        per.add(per1);
        per.add(per2);
        per.add(per3);
        per.add(per4);
        per.add(per5);

        for (Persons r : per
        ) {
            al.add(r);
        }

        System.out.println("Not sorted hashSet//////////");
        System.out.println(al);
        System.out.println("Sorted hashSet//////////");
        Collections.sort(al);
        System.out.println(al);


        //LinkedHashSet//////////////////////////////////////////////
        Set<Persons> perLink = new LinkedHashSet<>();
        ArrayList<Persons> alLink = new ArrayList<>();

        Persons per11 = new Persons(12, "Maria");
        Persons per21 = new Persons(20, "Katy");
        Persons per31 = new Persons(50, "Luk");
        Persons per41 = new Persons(67, "Nike");
        Persons per51 = new Persons(2, "Liz");

        perLink.add(per11);
        perLink.add(per21);
        perLink.add(per31);
        perLink.add(per41);
        perLink.add(per51);

        for (Persons rLink : perLink
        ) {
            alLink.add(rLink);
        }

        System.out.println("Not sorted LinkedHashSet//////////");
        System.out.println(alLink);
        System.out.println("Sorted LinkedHashSet//////////");
        Collections.sort(alLink);
        System.out.println(alLink);
    }
}

