import java.util.*;
import java.time.LocalDate;
import java.text.ParseException;
class Main
{
    public static void main(String[] args) throws ParseException
    {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Gün-ay giriniz (gg-aa) :");
      String str = scanner.nextLine();
      if(str.equals("")==false){
        
        int day=Integer.parseInt(str.split("-",0)[0]);
        int mnth=Integer.parseInt(str.split("-",0)[1]);
        int yr=0;
        if(mnth==1)
            yr=1;
        LocalDate date = LocalDate.of(yr, mnth, day);
       
        //Koç Burcu : 21 Mart - 20 Nisan
        if(date.compareTo(LocalDate.of(0, 3, 21))>=0 && date.compareTo(LocalDate.of(0, 4, 20))<=0)
        {
          System.out.println("Koç Burcu");
        }
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        else if(date.compareTo(LocalDate.of(0, 4, 21))>=0 && date.compareTo(LocalDate.of(0, 5, 21))<=0)
        {
          System.out.println("Boğa Burcu");
        }
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        else if(date.compareTo(LocalDate.of(0, 5, 22))>=0 && date.compareTo(LocalDate.of(0, 6, 22))<=0)
        {
          System.out.println("İkizler Burcu");
        }
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        else if(date.compareTo(LocalDate.of(0, 6, 23))>=0 && date.compareTo(LocalDate.of(0, 7, 22))<=0)
        {
          System.out.println("Yengeç Burcu");
        }
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        else if(date.compareTo(LocalDate.of(0, 7, 23))>=0 && date.compareTo(LocalDate.of(0, 8, 22))<=0)
        {
          System.out.println("Aslan Burcu");
        }
        //Başak Burcu : 23 Ağustos - 22 Eylül
        else if(date.compareTo(LocalDate.of(0, 8, 23))>=0 && date.compareTo(LocalDate.of(0, 9, 22))<=0)
        {
          System.out.println("Başak Burcu");
        }
        //Terazi Burcu : 23 Eylül - 22 Ekim
        else if(date.compareTo(LocalDate.of(0, 9, 22))>=0 && date.compareTo(LocalDate.of(0, 10, 22))<=0)
        {
          System.out.println("Terazi Burcu");
        }
        //Akrep Burcu : 23 Ekim - 21 Kasım
         else if(date.compareTo(LocalDate.of(0, 9, 22))>=0 && date.compareTo(LocalDate.of(0, 10, 22))<=0)
        {
          System.out.println("Akrep Burcu");
        }
        //Yay Burcu : 22 Kasım - 21 Aralık
         else if(date.compareTo(LocalDate.of(0, 9, 22))>=0 && date.compareTo(LocalDate.of(0, 10, 22))<=0)
        {
          System.out.println("Yay Burcu");
        }
        //Oğlak Burcu : 22 Aralık - 21 Ocak
         else if(date.compareTo(LocalDate.of(0, 12, 22))>=0 && date.compareTo(LocalDate.of(1, 1, 21))<=0)
        {
          System.out.println("Oğlak Burcu");
        }
        //Kova Burcu : 22 Ocak - 19 Şubat
         else if(date.compareTo(LocalDate.of(0, 1, 22))>=0 && date.compareTo(LocalDate.of(0, 2, 19))<=0)
        {
          System.out.println("Kova Burcu");
        }
        //Balık Burcu : 20 Şubat - 20 Mart
        else //if(date.compareTo(LocalDate.of(0, 9, 22))>=0 && date.compareTo(LocalDate.of(0, 10, 22))<=0)
        {
          System.out.println("Balık Burcu");
        }
      }
      else
      {
          System.out.println("bilgi girmediniz.");
      }
    }
}