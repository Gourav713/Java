public class Fibonnaci {
    public static int fiboNum(int n) {
        if(n==0||n==1){
            return n;
        }
        int fnm1 = fiboNum(n-1);
        int fnm2 = fiboNum(n-2);
        int fn = fnm2+fnm1;
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fiboNum(5));
    }
}
