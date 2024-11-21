import java.util.ArrayList;
import java.util.Scanner;

public class maxSumSubarray {
    //use kadhane algo
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        for(String part : parts){
            int num = Integer.parseInt(part);
            arr.add(num);
        }
        System.out.println(arr);
        int res = method2(arr);
        System.out.println(res);
    }

    public static int method1(ArrayList<Integer> arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i<arr.size();i++){
            currSum += arr.get(i);
            if(currSum > maxSum){
                maxSum = currSum;
            }

            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    public static int method2(ArrayList<Integer> arr){
        int maxSum = arr.get(0);
        int currSum = arr.get(0);
        for(int i = 1; i < arr.size() ; i++){
            currSum = arr.get(i) + Math.max(currSum,0);
            maxSum = Math.max(currSum , maxSum);
        }
        return maxSum;
    }
}
