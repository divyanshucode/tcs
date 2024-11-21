import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for (char c : input.toCharArray()){
            if (Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                arr.add(num);
            }
        }
        int k = sc.nextInt();
        System.out.println(arr);
        System.out.println(k);

//        int result = help(arr,k);
//        System.out.println("Kth largest element is " + result);

        int result = heapMethod(arr,k);
        System.out.println(result);

    }
    public static int help(ArrayList<Integer> arr,int k){
        Collections.sort(arr);

        int n = arr.size();
        return arr.get(n-k);

    }
    public static int heapMethod(ArrayList<Integer> arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < k ; i++){
            minHeap.offer(arr.get(i));
        }

        for(int i = k ; i < arr.size(); i++){
            if(arr.get(i) > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(arr.get(i));
            }
        }
        return minHeap.peek();
    }
}

