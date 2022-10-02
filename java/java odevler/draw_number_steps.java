import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Basamak sayısını giriniz :");
    int length = scanner.nextInt();
   
    int top=(length*2+3)/2;
    for(int i = length-1; i>=0; i--)
    {
        System.out.print(repeat(' ', top-i));
        System.out.println(repeat('*', (i * 2) + 1));
    } 
  }

  static String repeat(char c, int n)
  {
    return new String(new char[n]).replace('\0', c);
  }
}