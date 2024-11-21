import java.util.ArrayList;
import java.util.Scanner;

public class countVowelsandConsonants {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String element = sc.nextLine().trim();
            if (element.isEmpty()) {
                break;
            }
            arr.add(element);
        }
        System.out.println(arr);
        String result = String.join(" ",arr);
        System.out.println(result);
        CountResult res = help(result);
        System.out.println("vowels :" + res.vowels + ",consonants : " + res.consonants);
    }
    public static CountResult help(String s){
        String ref ="aeiouAEIOU";
        int vowels = 0;
        int consonants = 0;
        for(char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (ref.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new CountResult(vowels, consonants);
    }
}
class CountResult {
    int vowels;
    int consonants;

    CountResult(int vowels, int consonants) {
        this.vowels = vowels;
        this.consonants = consonants;
    }
}
