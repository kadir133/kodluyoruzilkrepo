public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6,7,8,9,10};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0/numbers[i];
        }

        System.out.println(sum / numbers.length);
    }
}