package topics;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.Consumer;

public class Topic15_ArrayStream {
    @Test
    public void arraySteam(){
        int[] intArr = {2,4,6,8,10};
        Arrays.stream(intArr)
                .forEach(e -> System.out.println(e*e));
    }

}
