import java.util.ArrayList;
import java.util.Scanner;
//O(n^3)
public class LongestCommonSubsequence {
    public static void main(String[] args){
        //Input space generated
        ArrayList<String>  arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNext()){
            arr.add(ss.next());
        }
        System.out.println(arr);
        String answer = longestPalindromicSubstring(input);
        System.out.println(answer);


    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String longestPalindromicSubstring(String s){
        if(s.length()<=1) return s;

        int maxLen = 1;
        String res = s.substring(0,1);
        //why j = i+maxlength , for eg we found maxlength of 3 in i = 0 & j = 3 range
        //we only need max substring so why bother for checking substring of length <= 3
        for(int i = 0;i<s.length();i++){
            for(int j = i+maxLen ; j <= s.length() ; j++){
                if(j-i > maxLen && isPalindrome(s.substring(i,j))){
                    maxLen=j-i;
                    res = s.substring(i,j);
                }
            }
        }
        return res;

    }
}
