import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);

    int a;

    System.out.print("n sayısını giriniz:");
    a = inp.nextInt();

    List < Integer > divisors = new ArrayList < Integer > ();
    for (int i = a - 1; i > 0; i--) {
      if (a % i == 0)
        divisors.add(i);
    }

    int sum = divisors.stream().reduce(0, Integer::sum);
    if (sum == a)
      System.out.println(a + " Mükemmel sayıdır.");
    else
      System.out.println(a + " Mükemmel sayı değildir.");
  }
}