package topics;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class Topic10_FlatMap {

    private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
            Lists.newArrayList("Mariam", "Alex", "Ismail"),
            Lists.newArrayList("John", "Alesha", "Andre"),
            Lists.newArrayList("Susy", "Ali")
    );

    @Before
    public void setUp() {
        System.out.println(arrayListOfNames);
    }

    @Test
    public void withoutFlatMap() throws Exception {
//    [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        List<String> listOfAllNames = new ArrayList<>();

        for (List<String> list : arrayListOfNames) {
            for (String name : list) {
                listOfAllNames.add(name);
            }
        }
        System.out.println(listOfAllNames);
    }

    @Test
    public void withFlatMap() throws Exception {
//   [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
        List<String> listOfAllNames = arrayListOfNames.stream()
                .flatMap(List::stream)  // arrayListOfNames -> arrayListOfNames.stream() === List::stream
                .collect(Collectors.toList());
        System.out.println(listOfAllNames);
    }

}

