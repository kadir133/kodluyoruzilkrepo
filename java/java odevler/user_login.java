import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        //değişkenler
        String userName, password;

        System.out.print("Kullanıcı adını giriniz: ");
        userName=inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password=inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız.");
        } else if(userName.equals("patika")) {
            System.out.println("Şifreniz hatalı.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (y/n)");
            String r=inp.nextLine();
            if(r.equals("y")) {

                boolean state=false;
                do {
                    System.out.print("Yeni şifreniz: ");
                    String newPass=inp.nextLine();
                    if(newPass.equals(password) || newPass.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu.");
                        state=true;
                    }
                } while(state==false);
                }
        } else {
            System.out.println("Kullanıcı bilgileriniz hatalı.");
        }
    }
}