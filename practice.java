/*Problem Statement

Write a Java program that does the following:

Declare three variables:

an integer a with value 10

an integer b with value 5

a double c with value 2.5

Perform these operations step by step:

Add a and b, store the result in a variable sum

Multiply sum with c, store the result in result
*/

import java.util.*;

public class practice{

    public static void main(String[]args){

        int a = 10;
        int b = 5;
        double c = 2.5;

        int sum = a+b;
        System.out.println(sum);
        double result = sum*c;
        System.out.println(result);
    }
}