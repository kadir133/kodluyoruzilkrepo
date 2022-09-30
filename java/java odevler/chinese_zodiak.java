import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Doğum yılını giriniz :");
    int date = scanner.naxtInt();
    if (date > 0) {

      if (date % 12 == 0) {
        System.out.println("Maymun");
      } else if (date % 12 == 1) {
        System.out.println("Horoz");
      } else if (date % 12 == 2) {
        System.out.println("Köpek");
      } else if (date % 12 == 3) {
        System.out.println("Domuz");
      } else if (date % 12 == 4) {
        System.out.println("Fare");
      } else if (date % 12 == 5) {
        System.out.println("Öküz");
      } else if (date % 12 == 6) {
        System.out.println("Kaplan");
      } else if (date % 12 == 7) {
        System.out.println("Tavşan");
      } else if (date % 12 == 8) {
        System.out.println("Ejderha");
      } else if (date % 12 == 9) {
        System.out.println("Yılan");
      } else if (date % 12 == 10) {
        System.out.println("At");
      } else {
        System.out.println("Koyun");
      }
    } else {
      System.out.println("bilgi girmediniz.");
    }
  }
}