public class SumOfDigits {
    public static void main(String[] args) {
        int sum = 0;
        int a = 12345;
        while (a > 0) {
            int mod = a % 10;
            a /= 10;
            sum = sum + mod;
        }
        System.out.println(sum);
    }

}
