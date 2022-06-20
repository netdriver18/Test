package module2.homeTask5.zooclub;

import java.util.List;
import java.util.Map;

public interface ZooClubInterface {

    public boolean addPerson(Map<String, List<String>> map, String person);

    public boolean addAnimal(Map<String, List<String>> map, String animal, String person);

    boolean delAnimal(Map<String, List<String>> map, String animal, String person);

    boolean delPerson(Map<String, List<String>> map, String person);

    public void printMap(Map<String, List<String>> map);
}
