package ilya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Маша", 19));
        list.add(new Person("Мария", 20));
        list.add(new Person("Настя", 21));
        list.add(new Person("Марина", 22));

//        for (Person l : list) {
//            System.out.println(l.getName() + " " + l.getAge());
//        }
//        System.out.println();
//        list.forEach(System.out::println);
//        System.out.println();
//        list.stream().filter(p -> p.getAge() > 20).forEach(System.out::println);
//        System.out.println();
//        list.stream().filter(p -> p.getAge() > 20).sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(System.out::println);
//        System.out.println();
//        double d = list.stream().filter(p -> p.getAge() > 20).sorted(Comparator.comparing(Person::getName)).mapToInt(Person::getAge).average().getAsDouble();
//        System.out.println(d);
//        Calc calc = (index, i, d) -> System.out.println(index + i + d);
//        calc.calc(1,2,3.1);

//        List<String> list1 = Arrays.asList("f", "w", "x", "r", "j");
//        list1.forEach(System.out::println);
//        System.out.println();
//        list1.stream().sorted(String::compareTo).forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        System.out.println(sumAll(numbers, n -> true));
        System.out.println(sumAll(numbers, n -> n % 2 == 0));
        System.out.println(sumAll(numbers, n -> n > 3));


        System.out.println(numbers.stream().filter(x -> x > 3).mapToInt(Integer::intValue).sum());

    }

    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        for (int number : numbers) {
            if (p.test(number)) {
                total += number;
            }
        }
        return total;
    }
}
