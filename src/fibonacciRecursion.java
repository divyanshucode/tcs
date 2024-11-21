import java.util.Scanner;

public class fibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        int res = helper(num);
//        System.out.println(res);
        int result = method2(num);
        System.out.println(result);

    }

    public static int helper(int num){
        if(num<=1) return num;

        return helper(num-1)+helper(num-2);
    }

     public static int method2(int num){
         if(num<=1) return num;

         int prev2 = 0;
         int prev1 = 1;
         for(int i = 2 ; i <= num ; i++){
             int curr = prev1+prev2;
             prev2 = prev1;
             prev1 = curr;
         }
        return prev1;
     }
}

