package id.dondon.ctci.chapter4;

import org.junit.Test;

public class InterviewQuestion7Test {

  @Test
  public void solution() {
    String[] projects = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    String[][] dependencies = {
        {"a", "b"},
        {"b", "c"},
        {"a", "c"},
        {"d", "e"},
        {"b", "d"},
        {"e", "f"},
        {"a", "f"},
        {"h", "i"},
        {"h", "j"},
        {"i", "j"},
        {"g", "j"}};
    String[] buildOrder = InterviewQuestion7.buildOrderWrapper(projects, dependencies);
    if (buildOrder == null) {
      System.out.println("Circular Dependency.");
    } else {
      for (String s : buildOrder) {
        System.out.println(s);
      }
    }
  }

}
