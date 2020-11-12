package topics;

import static org.assertj.core.api.Assertions.assertThat;

import beans.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mockdata.MockData;
import org.junit.Test;


public class Topic1_ImperativeVSDeclarative {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = MockData.getPeople();
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people
        int counter = 0;
        List<Person> youngerPersons = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() <= 18 && counter < 10) {
                youngerPersons.add(person);
                counter++;
            }
        }

        for (Person person : youngerPersons) {
            System.out.println(person);
        }

    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();
        people.stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
