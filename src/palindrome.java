import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char c : s.toCharArray()){
            if(Character.isLetter(c)){
                arr.add(Character.toString(c));

            }

        }
        System.out.println(arr);
        boolean res = isPalindrome(arr);
        System.out.println(res);
    }

    public static boolean isPalindrome(ArrayList<String> arr) {
        int left = 0;
        int right = arr.size() - 1;
        while (left < right) {
            if (!arr.get(left).equals(arr.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}
