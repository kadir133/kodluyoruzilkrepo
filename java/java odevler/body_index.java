import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        double a,b;

        //kullanıcıdan değerleri al.
        System.out.print("Boyunuzu giriniz: ");
        a=inp.nextDouble();
        System.out.print("Kilonuzu giriniz (cm): ");
        b=inp.nextDouble()/100;
        
        //Kilo (kg) /(Boy(m) * Boy(m))

        var u= b / (a * a)
         System.out.print("Vücut Kitle İndeksiniz :"+ u );
    }
}
