package module2.homeTask5.zooclub;

import java.util.*;

public class ZooClub implements ZooClubInterface {

    private Map<String, List<String>> map;

    public ZooClub(Map<String, List<String>> map) {
        this.map = map;
    }

    public boolean existingPerson(Map<String, List<String>> map, String value) {
        if (map.containsKey(value)){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public boolean addPerson(Map<String, List<String>> map, String person) {

        map.put(person, new ArrayList<String>());
        if (map.containsKey(person)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void printMap(Map<String, List<String>> map) {
        Iterator<Map.Entry<String, List<String>>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, List<String>> entry = entries.next();
            System.out.println("Person: " + entry.getKey().toString() + " has animals: " + entry.getValue().toString());
        }
    }

    @Override
    public boolean addAnimal(Map<String, List<String>> map, String animal, String person) {
        if (map.containsKey(person)) {
            List<String> animalList = map.get(person);
            animalList.add(animal);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delAnimal(Map<String, List<String>> map, String animal, String person) {
        if (map.containsKey(person)) {
            List<String> animalList = (List<String>) map.get(person);
            animalList.remove(animal);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delPerson(Map<String, List<String>> map, String person) {

        if (map.containsKey(person)) {
            map.remove(person);
            return true;
        } else {
            return false;
        }
    }


}


