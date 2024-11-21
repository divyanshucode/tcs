import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class anagram {
    public static void main(String [] args){
        ArrayList<String> arr1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                arr1.add(Character.toString(c));
            }
        }
        System.out.println(arr1);

        ArrayList<String> arr2 = new ArrayList<>();
        Scanner ss = new Scanner(System.in);
        String t = ss.nextLine();
        for(char c : t.toCharArray()){
            if(Character.isLetter(c)){
                arr2.add(Character.toString(c));
            }
        }
        System.out.println(arr2);

//        boolean res = anagramMap(s,t);
//        System.out.println(res);

        boolean result = anagramFreqArray(s,t);
        System.out.println(result);


    }
    public static boolean anagramMap(String s , String t){
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length() ) return false;

        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(char y : t.toCharArray()){
            map.put(y,map.getOrDefault(y,0)-1);
        }

        for(int val : map.values()){
            if(val != 0) return false;
        }
     return true;
    }

    public static boolean anagramFreqArray(String s , String t){
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];
        for(int i = 0; i < t.length() ; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int count : freq){
            if(count != 0) return false;
        }
        return true;
    }
}
