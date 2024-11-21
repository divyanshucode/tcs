import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char c : s.toCharArray()){
            if(Character.isLetter(c)){
                arr.add(Character.toString(c));


            }
        }
        System.out.println("The first Non repeating char is :" + firstNonRepeatingCharacter(arr));
    }

        public static String firstNonRepeatingCharacter(ArrayList<String> arr){
            HashMap<String,Integer> map = new HashMap<>();

            for(String ch : arr){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            for(String ch : arr){
                if(map.get(ch)==1){
                    return ch;
                }
            }
            return null;


    }

}
