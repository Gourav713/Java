// Find subsets of the string 
public class Introduction2 {
    public static void findSubsets(String str, int i, String ans) {
        // base case
        if (i == str.length()) {

            System.out.println(ans);
            return;
        }
        // if char says yes
        findSubsets(str, i + 1, ans + str.charAt(i));
        // if char says no
        findSubsets(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0,"");
    }
}
