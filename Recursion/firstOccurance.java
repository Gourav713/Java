public class firstOccurance {
    public static int FirstOccurance(int arr[], int key, int i) {
        if(i== arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,4,5,2,3,4,12,10,25,10,10};
        System.out.println(FirstOccurance(arr, 5, 0));
    }
}
