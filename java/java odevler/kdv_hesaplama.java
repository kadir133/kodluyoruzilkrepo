import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        double raw,kdv,cost;

        //kullanıcıdan değerleri al.
        System.out.print("Ürün fiyatı giriniz:");
        raw=inp.nextDoble();

        rate=raw<1000?18:8;

        kdv=raw*rate/100;
        cost=raw+kdv;

        System.out.print("KDV'siz Fiyat :"+raw);
        System.out.print("KDV'li Fiyat :"+cost);
        System.out.print("KDV tutarı :"+kdv);      
    }
}
