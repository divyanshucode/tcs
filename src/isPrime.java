import java.util.Scanner;
import java.util.ArrayList;



public class isPrime {
    public static void main(String [] args){
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        System.out.println(n);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 1; i<n ; i++){
            if(isPrime(i)){
                res.add(i);
            }
        }
        System.out.println(res);
    }
    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
//
//        for(int i = 2 ; i < n ; i++ ){
//            if(n%i == 0) return false;
//        }
        //optimize as we know ‘n’ cannot be divided by any number greater than ‘n/2’. [expect n itself]
//        for(int i = 2;i <= n/2 ;i++){
//              if(n%i == 0) return false;
//        }

        //2 optimize where we only check till square root
        //If a number n has no divisors other than 1 and itself up to sqrt(n)
        //, then n is prime; otherwise, it is composite, as any factors beyond sqrt(n)
        // will have a smaller paired factor already checked.

        //Since we found a factor (2), we know immediately that 100 is
        // not prime. We didn’t need to check anything beyond 10,
        // because if any factor existed above 10, it
        //  would have been paired with a factor below 10. For example:
        //
        //    4×25=1004×25=100
        //    5×20=1005×20=100
        //    10×10=10010×10=100
        for(int i =2 ; i*i <= n ; i++){
            if(n%i == 0) return false;
        }
      return true;
    }

}
