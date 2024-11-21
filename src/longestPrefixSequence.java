import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class longestPrefixSequence {
    public static void main(String [] args){
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String word[]  = input.split(",");
        for(String w : word){
            arr.add(w.trim());
        }
          System.out.println(arr);
//        String res = help(arr);
//        System.out.println(res);

        String result = help2(arr);
        System.out.println(result);
    }
    public static String help(ArrayList<String> arr){
        if(arr.size()==0) return "";

        String prefix = arr.get(0);
        for(int i = 1; i < arr.size() ; i++){
            while(arr.get(i).indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static String help2(ArrayList<String> arr){
        StringBuilder ans = new StringBuilder();
        Collections.sort(arr);
        String first = arr.get(0);
        String last = arr.get(arr.size()-1);
        for(int i = 0; i < Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}
