import java.util.*;

public class Main {
  public static void main(String args[]) {
    IsPrime();

  }

  static void IsPrime() {

    Scanner inp = new Scanner(System.in);
    System.out.print("Sayı giriniz : ");
    int number = inp.nextInt();

    boolean state = true;
    if (number <= 1) state = false;
    if (number == 2) state = true;
    else if (number % 2 == 0) state = false;

    var boundary = Math.sqrt(number);

    for (int i = 3; i <= boundary; i += 2)
      if (number % i == 0)
        state = false;

    System.out.println(state ? "Sayı asaldır." : "Sayı asal değildir.");
    System.out.println("*****************");
    IsPrime();
  }
}