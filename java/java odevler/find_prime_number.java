import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);

    List < Integer > primes = new ArrayList < Integer > ();
    primes.add(2);
    for (int i = 3; i < 100; i ++) {
      if (IsPrime(i))
         primes.add(i);
    }
    
    System.out.println(primes);
  }

   static boolean IsPrime(int number)
    {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        var boundary = Math.sqrt(number);
            
        for (int i = 3; i <= boundary; i += 2)
            if (number % i == 0)
                return false;
        
        return true;        
    }
}