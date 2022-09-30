import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Tarih giriniz :");
    int date = scanner.nextInt();
    if (date > 0) {

      if (date % 100 == 0 ? date % 400 == 0 : date % 4 == 0) {
        System.out.println(date " bir artık yıldır !");
      } else {
        System.out.println(date " bir artık yıl değildir !");
      }
    } else {
      System.out.println("bilgi girmediniz.");
    }
  }
}