import java.util.*;

public class Main {
  public static void main(String[] args) {

    power();
  }

  static void power() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Taban değeri giriniz : ");
    int base = scan.nextInt();
    System.out.print("Üs değeri giriniz : ");
    int exponent = scan.nextInt();
    int result = 1;

    for (int i = 1; i <= exponent; i++) {
      result *= base;
    }

    System.out.println("Sonuç : " + result);
    System.out.println("*****************");
    power();
  }
}