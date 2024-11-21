import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class majorityElement {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)){
                int num = Character.getNumericValue(c);
                arr.add(num);
            }
        }
        System.out.println(arr);
//        int res = method1(arr);
//        System.out.println(res);

//        int res = moore(arr);
//        System.out.println(res);

        int res = mapMethod(arr);
        System.out.println(res);
    }
    public static int method1(ArrayList<Integer> arr){
        Collections.sort(arr);

        return arr.get(arr.size()/2);
    }
    public static int moore(ArrayList<Integer> arr){
        //moore algo :
        //take candidate : mostly the first num
        //count intially at 0
        //if same candidate appear again count ++ :
        //if diff candidate present count --;
        //count doesnt go below 0 , so if count  is 0 , new num becomes the new candidate

        int candidate = 0;
        int cnt = 0;

        for(int num : arr){
            if(cnt == 0) {
                candidate = num;
            }
            if(num == candidate){
                cnt++;
            }else{
                cnt--;
            }

        }

     return candidate;
    }
    public static int mapMethod(ArrayList<Integer> arr){
        int n = arr.size();
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
     return 0;

    }

}
