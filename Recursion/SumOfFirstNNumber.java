public class SumOfFirstNNumber {
    public static int SumOfN(int n) {
        if(n ==1){
            return 1;
        }
        int snm1 = SumOfN(n-1);
        int sn = n + snm1;
        return sn;
    }
    public static void main(String[] args) {
        System.out.println(SumOfN(5));
    }
}
