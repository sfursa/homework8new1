package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Сергей", "Фролов", new Address("Слуцк", "Зеленая", 13));
        Person person2 = new Person(null, "Котова", new Address("Минск", "Фабричная", 25));
        Person person3 = new Person("Ольга", null, new Address("Борисов", "Гоголя", 123));
        Person person4 = new Person("Григорий", "Атрасевич", null);
        Person person5 = new Person("Виталий", "Заяц", new Address("Минск", "Короля", 150));
        Person person6 = new Person("Василий", "Шевченко", new Address("Могилев", "Ленини", 59));

        List<Person> Plist = new ArrayList<>();
        Plist.add(person1);
        Plist.add(person2);
        Plist.add(person3);
        Plist.add(person4);
        Plist.add(person5);
        Plist.add(person6);

        Plist
                .stream()
                .filter(noNull -> noNull.firstName != null && noNull.lastName != null && noNull.address != null)
                .sorted((h1, h2) -> h1.address.getHouseNumber() - h2.address.getHouseNumber())
                .map(a -> a.toString())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
