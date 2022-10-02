import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kaç elemanlı bir seri olmalı :");
    int length = scanner.nextInt();

    var a = 0;
    var b = 1;
    var c = 0;
    var total = 0;
    List < Integer > fibo = new ArrayList < Integer > ();

    for (int i = 0; i < length; i++) {
      c = a + b;
      a = b;
      b = c;
      total = total + c;
      fibo.add(c);
    }

    System.out.println("serinin elemanları:");
    System.out.println(fibo);
  }
}