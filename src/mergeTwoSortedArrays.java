import java.util.ArrayList;
import java.util.Scanner;

public class mergeTwoSortedArrays {
    public static void main(String [] args){
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        for(String part : parts){
            int num = Integer.parseInt(part);
            arr1.add(num);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        String input2 = sc.nextLine();
        String[] parts2 = input2.split(" ");
        for(String part : parts2){
            int num = Integer.parseInt(part);
            arr2.add(num);
        }
        System.out.println(arr1);
        System.out.println(arr2);
        ArrayList<Integer> result = help(arr1,arr2);
        System.out.println(result);
    }

    public static ArrayList help(ArrayList<Integer> arr1 , ArrayList<Integer> arr2){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr1.size();
        int m = arr2.size();
        int i =0;
        int j = 0;

        while(i < n && j < m){
            if(arr1.get(i) <= arr2.get(j)){
                res.add(arr1.get(i));
                i++;
            }else{
                res.add(arr2.get(j));
                j++;
            }
        }

        while(i < n){
            res.add(arr1.get(i));
            i++;
        }
        while (j < m) {
            res.add(arr2.get(j));
            j++;
        }
      return res;
    }
}
