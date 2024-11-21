import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class intersectionOfTwoArrays {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        Scanner ss = new Scanner(input1).useDelimiter(",");
        while (ss.hasNextInt()){
            arr1.add(ss.nextInt());

        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        String input2 = sc.nextLine();
        Scanner se = new Scanner(input2).useDelimiter(",");
        while(se.hasNextInt()){
            arr2.add(se.nextInt());
        }

        System.out.println(arr1 + " " + arr2);
        int[] finalResult = help(arr1,arr2);
        System.out.println(Arrays.toString(finalResult));
    }

    public static int[] help(ArrayList<Integer> arr1 , ArrayList<Integer> arr2){
        HashSet<Integer> container = new HashSet<>();
        HashSet<Integer> output = new HashSet<>();

        for(int num : arr1){
            container.add(num);
        }

        for (int num : arr2){
            if(container.contains(num)){
                output.add(num);
            }
        }
        int[] res = new int[output.size()];
        int index = 0;
        for(int x : output){
            res[index++] = x;
        }

        return res;
    }
}
