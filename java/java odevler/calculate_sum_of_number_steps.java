import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Sayı giriniz :");
    int number = scanner.nextInt();

    int temp = number;
    int total = 0;
    while (temp != 0) {
      int step = temp % 10;
      temp = temp / 10;
      total += step;
    }

    System.out.println("Basamaklar Toplamı = " + total);
  }
}