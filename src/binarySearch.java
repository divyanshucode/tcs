import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
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
        int target = sc.nextInt();
        int res = binarySearch(arr,target);
        System.out.println(res);
    }
    public static int binarySearch(ArrayList<Integer> arr , int target){
        int left = 0;
        int right = arr.size()-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr.get(mid) ==target) return mid;

            if(arr.get(mid)>target){
                right = mid-1;
            }

            else{
                left = mid+1;
            }
        }
      return -1;
    }
}
