import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);
    int length = 0;
    do {
      System.out.print("Listenin boyutunu giriniz : ");
      length = inp.nextInt();
      if (length <= 0) {
        System.out.println("0'dan büyük bir sayı giriniz.");
      }
    } while (length <= 0);

    int[] arr = new int[length];
    int i = 0;
    do {
      System.out.print((i + 1) + ".Sayı : ");
      arr[i] = inp.nextInt();
      i++;
    } while (i < length);

    Arrays.sort(arr);
    System.out.print(Arrays.toString(arr));
  }
}