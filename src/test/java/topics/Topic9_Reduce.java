package topics;


import beans.Car;
import com.google.common.collect.ImmutableList;
import mockdata.MockData;
import org.junit.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

public class Topic9_Reduce {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    Integer sum = Arrays.stream(integers)
            .reduce(0, (a, b) -> a + b);
    System.out.println(sum);
  }

  @Test
  public void  reduceOnObj() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();
    Double sumOfCarPrice = cars.stream()
            .map(Car::getPrice)
            .reduce(0.0, (a, b) -> a + b);
    System.out.println(BigDecimal.valueOf(sumOfCarPrice));
  }

}

