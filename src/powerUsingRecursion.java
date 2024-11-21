import java.util.Scanner;

public class powerUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();//base
        int n = sc.nextInt();//exponent

        System.out.println(x + " " + n);

        int res = help(x,n);
        System.out.println(res);

    }
    public static int help(int x , int n){
        if(n == 0) return 1;

        return x * help(x,n-1);
    }
}
