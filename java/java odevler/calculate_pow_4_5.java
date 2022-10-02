import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Limit sayısını giriniz :");
    int number = scanner.nextInt();
    if (number > 0) {

      System.out.println();
      System.out.println("4'ün üsleri");
      for (int i = 1; i <= number; i++)
        System.out.println("4^" + i + " = " + Math.pow(4, i));
      System.out.println();
      System.out.println("5'in üsleri");
      for (int i = 1; i <= number; i++)
        System.out.println("5^" + i + " = " + Math.pow(5, i));
    } else {
      System.out.println("bilgi girmediniz.");
    }
  }
}
