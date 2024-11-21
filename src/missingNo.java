import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class missingNo{
    public  static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                arr.add(num);
            }
        }
        System.out.println(arr);
//        int res = sumMethod(arr);
//        System.out.println(res);

//        int result = bsMethod(arr);
//        System.out.println(result);

        int result = xorMethod(arr);
        System.out.println(result);
    }
    public static int sumMethod(ArrayList<Integer> arr){
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            sum+=arr.get(i);
        }
        int expectedSum = (n*(n+1))/2;

        return expectedSum-sum;

    }

    public static int bsMethod(ArrayList<Integer> arr){
        Collections.sort(arr);
        int left = 0;
        int right = arr.size();
        while(left < right){
            int mid = (left + right)/2;
            if(arr.get(mid)>mid){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public static int xorMethod(ArrayList<Integer> arr){
        int n = arr.size();
        int res = n;
        for(int i=0; i<n; i++){
            res ^= i;
            res ^= arr.get(i);
        }
        return res;

    }
}
//another method
//class Solution {
//    int start = 0;
//    int max = 0;
//
//    public String longestPalindrome(String s) {
//        if(s.length() <= 1) return s;
//
//        char[] charArray = s.toCharArray();
//
//        for(int i = 0; i<charArray.length ; i++){
//            findPalindrome(charArray,i,i); // for odd length
//            findPalindrome(charArray, i , i+1); //even length
//        }
//        return s.substring(start,start+max);
//    }
//
//    private void findPalindrome(char[] charArray, int j , int k){
//        while(j >= 0 && k < charArray.length && charArray[j] == charArray[k]){
//            j--;
//            k++;
//        }
//
//        if(max < k-j-1){
//            max=k-j-1;
//            start = j+1;
//        }
//    }
//}
