import java.util.Scanner;

public class isLeapYear {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean res = leap(year);
        System.out.println(res);

    }
    public static boolean leap(int year){
        if((year % 400 == 0) || ((year%100 != 0) && (year % 4 == 0))){
            return true;
        }

        return false;
    }

}
