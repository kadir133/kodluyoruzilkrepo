import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    boolean state = true;
    do {
      System.out.print("Sayı giriniz :");
      int number = scanner.nextInt();
      state = number % 2 == 0;
      if (state && number % 4 == 0)
        sum += number;
    } while (state);

    System.out.println("Toplam : " + sum);
  }
}