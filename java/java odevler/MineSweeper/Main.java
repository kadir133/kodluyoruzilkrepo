import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mayın tarlası oynuna hoş geldin !\n"+
        "Matrix boyutunu gir : ");
        int x , y ;
        x = scanner.nextInt();
        y = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(x, y);
        mineSweeper.run();
        mine.run();
    }
}