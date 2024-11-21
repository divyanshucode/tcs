import java.util.Scanner;

public class perfectNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n                       );
        boolean ans = checkPerfectNumber(n);
        System.out.println(ans);
    }
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i <= (num/2) ; i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        return sum == num;
    }

}
