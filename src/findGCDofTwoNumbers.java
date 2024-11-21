import java.util.Scanner;

public class findGCDofTwoNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + "," + b);
//        int answer = brute(a,b);
//        System.out.println(answer);

        int ans = euclidean(a,b);
        System.out.println(ans);
    }

    public static int brute(int a,int b){
        int result = Math.min(a,b);

        while(result>0){
            if(a%result == 0 && b%result==0){
                break;
            }
            result--;

        }
        return result;
    }
    //eculidean : gcd of two numbers doesn’t change if the smaller number is subtracted from the bigger number
    public static int euclidean(int a, int b){
        if(a==0) return b;
        if(b==0) return a;

        if(a==b) return a;

        if(a>b)
            return euclidean(a-b,b);
        return euclidean(a,b-a);
    }
}
//some optimization
//if (a > b) {
//        if (a % b == 0)
//        return b;
//        return gcd(a - b, b);
//        }
//        if (b % a == 0)
//        return a;
//        return gcd(a, b - a);


//or
//  if (b == 0)
//          return a;
//          return gcd(b, a % b);