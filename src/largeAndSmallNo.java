import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class largeAndSmallNo {
    public static void main(String[] args){
//        ArrayList<Integer> arr = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] parts = input.split(" ");
//        for(String part : parts){
//                int num = Integer.parseInt(part);
//                arr.add(num);
//
//        }
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner ss = new Scanner(input);
        while (ss.hasNextInt()) {
            arr.add(ss.nextInt());
        }

        System.out.println(arr);
        int[] res = help(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] help(ArrayList<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);

        for (int num : arr) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

        }
        return new int[]{min, max};
    }
}
