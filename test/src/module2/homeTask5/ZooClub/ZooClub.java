package module2.homeTask5.ZooClub;

import module2.homeTask4.lists.Persons;

import java.util.*;

public class ZooClub implements ZooClubInterface {

    private Map<Person, List<Animal>> map;

    public ZooClub(Map<Person, List<Animal>> map) {
        this.map = map;
    }

    public boolean existingPerson(Map<Person, List<Animal>> map, String value) {
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equals(value)) {
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public boolean addPerson(Map<Person, List<Animal>> map, String person) {
        if (map.containsKey(person)) {
            return false;
        } else map.put(new Person(person), new ArrayList<>());
        return true;
    }

    @Override
    public void printMap(Map<Person, List<Animal>> map) {
        Iterator<Map.Entry<Person, List<Animal>>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Person, List<Animal>> entry = entries.next();
            System.out.println("Person: " + entry.getKey().toString() + " has animals: " + entry.getValue().toString());
        }
    }

    @Override
    public boolean addAnimal(Map<Person, List<Animal>> map, String animal, String person) {
        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equals(person)) {
                List<Animal> listAddAnimal = entry.getValue();
                listAddAnimal.add(new Animal(animal));
            } else return false;
        }
        return false;
    }

    @Override
    public boolean delAnimal(Map<Person, List<Animal>> map, String animal, String person) {

        for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
            if (entry.getKey().getName().equals(person)) {
                List<Animal> listAddAnimal = entry.getValue();
                for (Animal aLink : listAddAnimal) {
                    if (aLink.getNameAnimal().equals(animal)) {
                        listAddAnimal.remove(aLink);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean delPerson(Map<Person, List<Animal>> map, String person) {
        if (map.containsKey(person)) {
            map.remove(person);
            return true;
        } else {
            return false;
        }
    }
}





