import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.0;
        int armutK,elmaK,domatesK,muzK,patlıcanK;

        // Armut Kaç Kilo ? :0
        // Elma Kaç Kilo ? :1
        // Domates Kaç Kilo ? :1
        // Muz Kaç Kilo ? :2
        // Patlıcan Kaç Kilo ? :3
        // Toplam Tutar : 21.68 TL

        System.out.print("Armut Kaç Kilo ? ");
        armutK=inp.nextInt();
        System.out.print("Elma Kaç Kilo ? ");
        elmaK=inp.nextInt();        
        System.out.print("Domates Kaç Kilo ? ");
        domatesK=inp.nextInt();        
        System.out.print("Muz Kaç Kilo ? ");
        muzK=inp.nextInt();        
        System.out.print("Patlıcan Kaç Kilo ? ");
        patlıcanK=inp.nextInt();
                
        total=armut*armutK+elma*elmaK+domates*domatesK+muz*muzK+patlıcan* patlıcanK;
        System.out.print("Toplam Tutar :"+total+" TL");            
    }
}