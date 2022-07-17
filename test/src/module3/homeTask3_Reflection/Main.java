package module3.homeTask3_Reflection;


import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Object myObject = findClassByName();
        System.out.println(myObject);
        findMethods();
        findFields();
        testConstructor();
        testInstance();
        testInstanceObject();

    }

    private static @Nullable Object findClassByName() {
        try {
            Class<Animal> animalClass = (Class<Animal>) Class.forName("module3.homeTask3_Reflection.Animal");
            return animalClass;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void findMethods() {
        Class<Animal> animalClass = Animal.class;
        Method[] methods = animalClass.getDeclaredMethods();
        Arrays.stream(methods).forEach(field -> System.out.println(field.getName()));
    }

    private static void findFields() {
        Class<Animal> animalClass = Animal.class;
        Field[] fields = animalClass.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> System.out.println(field.getName()));
    }

    private static void testConstructor() {
        Class<Animal> animalClass = Animal.class;
        Constructor[] constructors = animalClass.getConstructors();
        Arrays.stream(constructors).forEach(e -> System.out.println(constructors));
    }

    private static void testInstance() throws InstantiationException, IllegalAccessException {
        Animal animal = Animal.class.newInstance();
        Class<? extends Animal> animalClass = animal.getClass();
        Constructor<?>[] constructors = animalClass.getConstructors();
        Arrays.stream(constructors).forEach(e -> System.out.println(e.toString()));
    }

    private static void testInstanceObject() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor constructor = Animal.class.getConstructor(int.class, String.class);
        Animal myObject = (Animal)
                constructor.newInstance(2, "predator");
        System.out.println(myObject);
    }
}
