import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        double a,b,c;

        //kullanıcıdan değerleri al.
        System.out.print("1. kenar uzunluğunu giriniz:");
        a=inp.nextInt();
        System.out.print("2. kenar uzunluğunu giriniz:");
        b=inp.nextInt();
        System.out.print("3. kenar uzunluğunu giriniz:");
        c=inp.nextInt();

        // kenar3=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        var u=(a+b+c)/2;
         System.out.print("Alan :"+ u * (u - a)* (u -b) * (u -c));
         System.out.print("Çevre :"+2*u);
    }
}