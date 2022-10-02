import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

    System.out.print("Sayı giriniz :");
    int number = scanner.nextInt();

    Arrays.sort(list);

    int min = 0;
    int max = 0;

    for (int i: list) {
      if (i < number && (min == 0 || i > min)) {
        min = i;
      }
      if (i > number && (max == 0 || i < max)) {
        max = i;
      }
    }

    System.out.println("Minimum Değer " + min);
    System.out.println("Maximum Değer " + max);

  }
}