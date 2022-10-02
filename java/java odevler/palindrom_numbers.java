import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
    int number = scanner.nextInt();

    System.out.println(number + " sayısı palindrom " + (isPalindrom(number) ? "sayıdır." : "sayı değildir."));
  }

  static boolean isPalindrom(int number) {
    int temp = number, reverseNumber = 0, lastNumber;
    while (temp != 0) {
      lastNumber = temp % 10;
      reverseNumber = (reverseNumber * 10) + lastNumber;
      temp /= 10;
    }
    return number == reverseNumber;
  }
}