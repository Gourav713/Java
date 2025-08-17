// Permutaion for the string 
public class Introduction3 {
    public static void Permutaion(String str , String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            // abcde
            // "ab" + "de" => "abde"
            String newStr = str.substring(0, i)+ str.substring(i+1, str.length());
            Permutaion(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        Permutaion(str, "");
    }
}
