package topics;


import java.util.Arrays;
import java.util.function.Predicate;
import org.junit.Test;

public class Topic6_Findany_FindFirst {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer integer = Arrays.stream(numbers)
            .filter(intValue -> intValue < 10 && intValue > 5)
            .findAny()
            .get();

    System.out.println(integer);

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Integer integer = Arrays.stream(numbers)
            .filter(intValue -> intValue < 10 && intValue > 5)
            .findFirst()
            .get();

    System.out.println(integer);

  }
}

