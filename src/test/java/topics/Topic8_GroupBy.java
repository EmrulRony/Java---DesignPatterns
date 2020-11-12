package topics;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import beans.Car;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

public class Topic8_GroupBy {

    @Test
    public void simpleGrouping() throws Exception {
        ImmutableList<Car> carList = MockData.getCars();
        Map<String, List<Car>> makeCar = carList.stream()
                .collect(Collectors.groupingBy(Car::getMake));//car -> car.getMake() === Car::getMake()

        makeCar.forEach((make,cars) -> {
            System.out.println(make);
            cars.forEach(System.out::println);
        });
    }

    @Test
    public void groupingAndCounting() throws Exception {
        ArrayList<String> names = Lists
                .newArrayList(
                        "John",
                        "John",
                        "Mariam",
                        "Alex",
                        "Mohammado",
                        "Mohammado",
                        "Vincent",
                        "Alex",
                        "Alex"
                );


    }

}