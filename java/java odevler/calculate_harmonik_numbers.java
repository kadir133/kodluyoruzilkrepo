import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("N sayısını giriniz :");
    int n = scanner.nextInt();

    double answer = 1;
    System.out.println();
    for (int i = 1; i <= n; i++)
      answer += (1.0/i);
    System.out.println("Cevap  : " + answer);
  }
}