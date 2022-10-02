import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] list = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1 };

    List < Integer > dups = new ArrayList < Integer > ();

    for (int i: list) {
      if (dups.contains(i))
        continue;

      int counter = 0;
      for (int j: list) {
        if (i == j)
          counter++;
      }
      if (counter > 1)
        dups.add(i);
    }

    System.out.println(dups);
  }
}