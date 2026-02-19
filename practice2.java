/*Find the largest digit in a number.*/

import java.util.*;

public class practice2{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        int max = 0;

        while(number !=0){
            int digit = number % 10;

            if(digit>max){
                max = digit;  
            }
            number = number / 10;
        }
        System.out.println("the largest digit is:"+max);
    }
}