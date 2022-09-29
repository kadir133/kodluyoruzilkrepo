import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        //değişkenler
        double r,a,pi=3.14;

        //kullanıcıdan değerleri al.
        System.out.print("Yarıçap uzunluğunu giriniz:");
        r=inp.nextInt();

        // Alan Formülü : π * r * r;
        // Çevre Formülü : 2 * π * r;

        double alan= pi * r * r;
        double cevre= 2 * pi * r;

        System.out.println("Alan :"+ alan);
        System.out.println("Çevre :"+cevre);

        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        System.out.print("Dilimin açısını giriniz:");
        a=inp.nextInt();

        double dilim=(pi * (r * r) * a) / 360;
        System.out.println("Dilimin alanı :"+ dilim);
    }
}