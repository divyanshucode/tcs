import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int res = fact(num);
//        System.out.println(res);

        int recres = recFact(num);
        System.out.println(recres);

    }
    public static int fact(int num){
        if(num == 0 || num == 1) return 1;

        int prod = 1;
        for(int i = 2; i <= num ; i++){
            prod = prod * i;
        }
        return prod;
    }

    public static int recFact(int num){
        if(num == 0 || num == 1) return 1;
        int result = 1;

        return num * recFact(num-1);
    }

}
