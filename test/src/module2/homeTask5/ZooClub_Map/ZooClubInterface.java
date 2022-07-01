package module2.homeTask5.ZooClub_Map;

import java.util.List;
import java.util.Map;

public interface ZooClubInterface {

    public boolean addPerson(Map<Person, List<Animal>> map, String person);

    public boolean addAnimal(Map<Person, List<Animal>> map, String animal, String person);

    boolean delAnimal(Map<Person, List<Animal>> map, String animal, String person);

    boolean delPerson(Map<Person, List<Animal>> map, String person);

    public void printMap(Map<Person, List<Animal>> map);
}
