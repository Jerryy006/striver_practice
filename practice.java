import java.util.*;

public class practice{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        long number = sc.nextLong();

        long reverse = 0;

        while(number !=0){

        long digit = number % 10;

        reverse = reverse * 10 + digit;

        number = number / 10;
    }


    System.out.println("the reaverse of the number is:" +reverse);
}
}