public class Factorial {
    public static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        int fnm1 = fact(num - 1);
        int fn = num * fnm1;
        return fn;
    }

    public static void main(String[] args) {
        System.err.println(fact(10));
    }
}