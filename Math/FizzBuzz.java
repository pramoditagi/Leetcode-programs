package Math;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public List<String> fizzBuzz(int n) {
    ArrayList<String> arrayList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        arrayList.add("FizzBuzz");
      } else if (i % 3 == 0) {
        arrayList.add("Fizz");
      } else if (i % 5 == 0) {
        arrayList.add("Buzz");
      } else {
        arrayList.add("" + i);
      }
    }
    return arrayList;
  }

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    System.out.println(fizzBuzz.fizzBuzz(5));
  }
}
