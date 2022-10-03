import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);

    //değişkenler
    int a, b;

    //kullanıcıdan değerleri al.
    System.out.print("Küme eleman sayısını giriniz:");
    a = inp.nextInt();
    System.out.print("Alt küme eleman sayısını giriniz:");
    b = inp.nextInt();

    //C(n,r) = n! / (r! * (n-r)!)
    System.out.print("Kombinasyon :" + (fac(a) / (fac(b) * fac(a - b))));
  }

  static int fac(int x) {
    if (x == 1)
      return 1;
    return x * fac(x - 1);
  }
}
