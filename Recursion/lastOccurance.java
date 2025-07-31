public class lastOccurance {
    public static int LastOccurance(int arr[], int key, int i) {
        if(i==0){
            return -1;

        }
        if(arr[i]==key){
            return i;
        }
        return LastOccurance(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,5,5,5,8,9};
        System.out.println(LastOccurance(arr, 5, arr.length-1));

    }
}
