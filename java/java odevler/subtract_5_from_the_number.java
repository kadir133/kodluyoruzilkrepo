import java.util.*;
class Main {
  public static void main(String[] args) {

    subtract();
  }

  static void subtract() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Sayı giriniz : ");
    int number = scanner.nextInt();

    int temp = number;
    System.out.println(temp);
    while (temp > 0) {
      temp -= 5;
      System.out.println(temp);
    }
    while (temp < number) {
      temp += 5;
      System.out.println(temp);
    }

    System.out.println("*****************");
    subtract();
  }
}