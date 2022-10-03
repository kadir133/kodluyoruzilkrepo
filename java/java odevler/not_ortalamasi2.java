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

        double cnt=6.0;
        if(mat<0||mat>100)   {
            mat=0;
            cnt--;
        }
        if(fizik<0||fizik>100)  {
            fizik=0;
            cnt--;
        }
        if(kimya<0||kimya>100)   {
            kimya=0;
            cnt--;
        }
        if(turkce<0||turkce>100)  {
            turkce=0;
            cnt--;
        }
        if(tarih<0||tarih>100)     {
            tarih=0;
            cnt--;
        }
        if(muzik<0||muzik>100)      {
            muzik=0;
            cnt--;
        }

        if(cnt==0)
            return;

        var avg=(mat+fizik+kimya+turkce+tarih+muzik)/cnt;
        System.out.print("Not Ortalaması :"+avg);

        if(avg<55)
            System.out.print("Sınıfta Kaldı");
        else
            System.out.print("Sınıfı Geçti");

    }
}