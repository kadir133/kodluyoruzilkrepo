import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kenar uzunluğunu giriniz :");
    int length = scanner.nextInt();
   
    int top=(length*2+3)/2;
    for(int i = 0; i<length; i++)
    {
        System.out.print(repeat(' ', top-i));
        System.out.println(repeat('*', (i * 2) + 1));
    } 
    for(int i = length-2; i>=0; i--)
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
