import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        double a,b,sonuc=0;
        int select=0;

        System.out.print("İlk sayıyı giriniz: ");
        a=inp.nextDouble();
        System.out.print("2.sayıyı giriniz: ");
        b=inp.nextDouble();

        System.out.println("1(+) - Toplama\n2(-) - Çıkarma\n3(/) - Bölme\n4(*) - Çarpma\n");
        System.out.print("İşlem seciniz : ");
        try {
            select = inp.nextInt();
        } catch(Exception e) {
            char str= inp.next().charAt(0);
            if(str=='+')
                select = 1;
            else if(str=='-')
                select=2;
            else if(str=='/')
                select=3;
            else if(str=='*')
                select=4;
        }

        switch (select) {
        case 1:
            sonuc=a+b;
            break;
        case 2:
            sonuc=a-b;
            break;
        case 3:
            sonuc=a/b;
            break;
        case 4:
            sonuc=a*b;
            break;
        default:
            System.out.println("Yanlış seçim yaptınız.");
            break;
        }

        System.out.println("Sonuç = "+sonuc);
    }
}