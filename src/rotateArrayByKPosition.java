import java.util.ArrayList;
import java.util.Scanner;
public class rotateArrayByKPosition {
    public  static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input).useDelimiter(",");
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }
        int k = scanner.nextInt();
        System.out.println(arr);
        System.out.println(k);
        //reverse entire array
        //then reverse first k element
        //reverse remaining element
        k = k % arr.size();
        reverseMethod(arr,0,arr.size()-1);
        reverseMethod(arr,0,k-1);
        reverseMethod(arr,k,arr.size()-1);
        System.out.println(arr);

    }
    public static void reverseMethod(ArrayList<Integer> arr , int left , int right){
        while (left<right){
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right,temp);
            left++;
            right--;
        }
        //another approach
        // Copy the last k elements of nums to temp
//        for (int i = 0; i < k; i++) {
//            temp[i] = nums[n - k + i];
//        }
//
//        // Shift the first n-k elements to the right
//        for (int i = n - 1; i >= k; i--) {
//            nums[i] = nums[i - k];
//        }
//
//        // Copy the elements from temp back to nums
//        for (int i = 0; i < k; i++) {
//            nums[i] = temp[i];
//        }

    }
}
