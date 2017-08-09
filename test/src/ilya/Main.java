package ilya;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Маша", 19));
        list.add(new Person("Мария", 20));
        list.add(new Person("Настя", 21));
        list.add(new Person("Марина", 22));

        for (Person l : list) {
            System.out.println(l.getName() + " " + l.getAge());
        }
        System.out.println();
        list.forEach(System.out::println);
        System.out.println();
        list.stream().filter(p -> p.getAge() > 20).forEach(System.out::println);
        System.out.println();
        list.stream().filter(p -> p.getAge() > 20).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);
        System.out.println();
        double d = list.stream().filter(p -> p.getAge() > 20).sorted(Comparator.comparing(Person::getName)).mapToInt(Person::getAge).average().getAsDouble();
        System.out.println(d);
    }
}
