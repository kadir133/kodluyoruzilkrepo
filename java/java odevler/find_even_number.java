import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Limit sayısını giriniz :");
    int number = scanner.nextInt();
    if (number > 0) {

      for (int i = 1; i <= number; i++)
        if (i % 2 == 0) {
          if (i > 2)
            System.out.print(", ");
          System.out.print(i);
        }
    } else {
      System.out.println("bilgi girmediniz.");
    }
  }
}