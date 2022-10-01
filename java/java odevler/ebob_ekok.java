import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        int a,b,c;

        //kullanıcıdan değerleri al.
        System.out.print("n1 sayısını giriniz:");
        a=inp.nextInt();
        System.out.print("n2 sayısını giriniz:");
        b=inp.nextInt();
        
        int temp=a;
        if(a > b)
        {
            a=b;
            b=temp;
        }
        
        int ebob=a;
        while(a%ebob!=0||b%ebob!=0)
        {
            ebob--;
        }
        
        System.out.println("ebob = "+ebob);
        System.out.print("ekok = "+((a*b)/ebob));
    }
}