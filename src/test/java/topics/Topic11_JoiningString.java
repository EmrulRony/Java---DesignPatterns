package topics;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class Topic11_JoiningString {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String joinedNames = String.join(",",names);
    System.out.println(joinedNames);
  }

  @Test
  public void joiningStringsUsingStringBuilder() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    StringBuilder namesBuilder = new StringBuilder();
    names.forEach(name -> {
      namesBuilder.append(name).append(",");
    });
    namesBuilder.delete(namesBuilder.length()-1,namesBuilder.length());
    System.out.println(namesBuilder);
  }


  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String joinedNames = names.stream()
            .collect(Collectors.joining(","));
    System.out.println(joinedNames);

  }
}
