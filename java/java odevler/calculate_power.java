import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Taban sayısını giriniz :");
    int base = scanner.nextInt();

    System.out.print("Üssü giriniz :");
    int pow = scanner.nextInt();

    int answer = 1;
    System.out.println();
    for (int i = 1; i <= pow; i++)
      answer *= base;
    System.out.println("Cevap  : " + answer);
  }
}
