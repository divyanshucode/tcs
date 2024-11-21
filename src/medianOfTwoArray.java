import java.util.ArrayList;
import java.util.Scanner;

public class medianOfTwoArray {
    public static void main(String [] args){
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String[] numbers = input1.split("[\\s,]");
        for (String num : numbers) {
            try {
                arr1.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + num);
            }
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        Scanner ss = new Scanner(System.in);
        String input2 = ss.nextLine();
        String[] numbers2 = input2.split("[\\s,]+");
        for (String num : numbers2) {
            try {
                arr2.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + num);
            }
        }
        System.out.println(arr1);
        System.out.println(arr2);
//        double answer = bruteForce(arr1,arr2);
//        System.out.println(answer);

//        double answer = better(arr1,arr2);
//        System.out.println(answer);

        double answer = best(arr1,arr2);
        System.out.println(answer);
    }

    public static double bruteForce(ArrayList<Integer> arr1 , ArrayList<Integer> arr2){
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m ){
            if(arr1.get(i)<=arr2.get(j)){
                ans.add(arr1.get(i++));
            }else{
                ans.add(arr2.get(j++));
            }
        }

        while (i<n){
            ans.add(arr1.get(i++));
        }

        while (j<m){
            ans.add(arr2.get(j++));
        }

        int x = ans.size();
        if(x % 2 == 1) return ans.get(x/2);
         return (ans.get(x/2-1) + ans.get(x/2))/2.0;
    }

    public static double better(ArrayList<Integer> arr1 , ArrayList<Integer> arr2){
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int idx1 = (m+n)/2;
        int idx2 = idx1-1;
        int x = m+n;
        int cnt = 0;
        int element1 = -1;
        int element2 = -1;


        while (i<n && j<m){
            if(arr1.get(i) < arr2.get(j)){
                if(cnt == idx1) element1 = arr1.get(i);
                if(cnt == idx2) element2 = arr1.get(i);
                cnt++;
                i++;
            }else{
                if(cnt == idx1) element1 = arr2.get(j);
                if(cnt == idx2) element2 = arr2.get(j);
                cnt++;
                j++;
            }
        }

        while (i<n){
            if(cnt == idx1) element1 = arr1.get(i);
            if(cnt == idx2) element2 = arr1.get(i);
            cnt++;
            i++;
        }

        while (j<m){
            if(cnt == idx1) element1 = arr2.get(j);
            if(cnt == idx2) element2 = arr2.get(j);
            cnt++;
            j++;
        }
      if(x%2 == 0) return (element1+element2)/2.0;

      return element1;
    }
    public static double best(ArrayList<Integer> arr1 , ArrayList<Integer> arr2){
        int n1 = arr1.size();
        int n2 = arr2.size();
        if(n1>n2)  return best(arr2,arr1);

        int n = n1+n2;
        int halflen = (n+1)/2;
        int low = 0;
        int high = n1;
        while(low <= high){
            int mid1 = (low+high)/2 ;
            int mid2 = halflen - mid1;

            int l1 = (mid1>0) ? arr1.get(mid1-1) : Integer.MIN_VALUE;
            int l2 = (mid2>0) ? arr2.get(mid2-1) : Integer.MIN_VALUE;

            int r1 = (mid1<n1) ? arr1.get(mid1) : Integer.MAX_VALUE;
            int r2 = (mid2<n2) ? arr2.get(mid2) : Integer.MAX_VALUE;


            if(l1<=r2 && l2<=r1){
                if(n % 2 == 1) {
                    return Math.max(l1, l2);
                }else{
                    return (Math.max(l1,l2) + Math.min(r1,r2))/2.0;
                }
            }else if(l1>r2){
                high = mid1-1;
            }else{
                low = mid1+1;
            }
        }
        return -1;
    }
}
