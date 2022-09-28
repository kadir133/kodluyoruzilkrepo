import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        int mat,fizik,kimya,turkce,tarih,muzik;

        //kullanıcıdan değerleri al.
        System.out.print("Matematik notunu giriniz:");
        mat=inp.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizik=inp.nextInt();
        System.out.print("Kimya notunu giriniz:");
        kimya=inp.nextInt();
        System.out.print("Turkce notunu giriniz:");
        turkce=inp.nextInt();
        System.out.print("Tarih notunu giriniz:");
        tarih=inp.nextInt();
        System.out.print("Muzik notunu giriniz:");
        muzik=inp.nextInt();

        var avg=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.print("Not Ortalaması :"+avg);

        if(avg<60)        
            System.out.print("Sınıfta Kaldı");
        else            
            System.out.print("Sınıfı Geçti");
      
    }
}