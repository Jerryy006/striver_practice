import java.util.*;

public class reverse2{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a two digit number:");
        int number = sc.nextInt();

        int tens = number / 10;
        int ones = number % 10;

        int reverse = ones * 10 + tens;

    System.out.println("the reverse of the number is:"+reverse);
    }
}