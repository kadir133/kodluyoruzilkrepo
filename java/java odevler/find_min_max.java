import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kaç tane sayı gireceksiniz:");
    int count = scanner.nextInt();
    List<Integer> numbers=new ArrayList<Integer>();
    
    int i=1;
    while (i<=count) {
        System.out.print(i+". Sayıyı giriniz:");
        numbers.add(scanner.nextInt());
        i++;
    }

    System.out.println("En büyük sayı:"+Collections.max(numbers));
    System.out.println("En küçük sayı:"+Collections.min(numbers));
  }
}