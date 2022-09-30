import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double pricePerKm = 0.1;

    System.out.print("Mesafeyi giriniz (km) :");
    int km = scanner.nextInt();

    System.out.print("Yaşınızı giriniz :");
    int age = scanner.nextInt();

    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
    int type = scanner.nextInt();

    //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    if (km <= 0 || age <= 0 || (type != 1 && type != 2))
      System.out.println("Hatalı Veri Girdiniz !");

    //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    if (age < 12)
      pricePerKm -= (pricePerKm * 0.5);

    //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    else if (age <= 24)
      pricePerKm -= (pricePerKm * 0.1);

    //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    else if (age > 65)
      pricePerKm -= (pricePerKm * 0.3);

    //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
    if (type == 2)
      pricePerKm -= (pricePerKm * 0.2);

    //totalCost
    double totalCost = km * pricePerKm;
    if (type == 2)
      totalCost *= 2;
    System.out.println("Toplam Tutar = " + totalCost + " TL");

  }
}