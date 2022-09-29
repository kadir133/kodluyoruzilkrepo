import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        
        int[] arr=new int[3];

        System.out.print("1.Sayı : ");
            arr[0]=inp.nextInt();
        System.out.print("2.Sayı : ");
            arr[1]=inp.nextInt();        
        System.out.print("3.Sayı : ");
            arr[2]=inp.nextInt();

        Arrays.sort(arr);        
        System.out.print(Arrays.toString(arr));            
    }
}