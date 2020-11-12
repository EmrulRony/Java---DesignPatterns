package topics;

import beans.Person;

import java.util.List;
import java.util.stream.IntStream;

import mockdata.MockData;
import org.junit.Test;

public class Topic2_Range_Iterate {

    @Test
    public void range() throws Exception {
        // imperative style
        System.out.println("imperative");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        //declarative inclusive
        System.out.println("\n declarative -->");
        System.out.println("inclusive");
        IntStream.range(0, 10).forEach(value -> System.out.print(value + " "));
        //declarative exclusive
        System.out.println("\n exclusive");
        IntStream.rangeClosed(0, 10).forEach(value -> System.out.print(value + " "));
    }

    @Test
    public void rangeIteratingLists() throws Exception {
        List<Person> people = MockData.getPeople();
        //task: Iterate through the list using index

        // imperative style
//        for (int i = 0; i < people.size(); i++) {
//            System.out.println(people.get(i));
//        }

        // declarative style
        IntStream.range(0, people.size())
                .forEach(index -> {
                    System.out.println(people.get(index));
                });

    }

    @Test
    public void intStreamIterate() throws Exception {
        IntStream.iterate(0, operand -> operand + 5)
                .filter(number -> number % 2 == 0)
                .limit(20)
                .forEach(System.out::println);
    }
}
