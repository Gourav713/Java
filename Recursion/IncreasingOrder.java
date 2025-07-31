public class IncreasingOrder {
    public static void inNum(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        inNum(n-1);
        System.out.print(n +" ");
    }
    public static void main(String args[]){
        int n=10;
        inNum(n);
    }
}