// a program to take two inputs and operator from the user and performs the operation
// then prints the result for the users


import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        double res=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter first number:");

        double s1= s.nextDouble();

        System.out.println("Enter second number: ");

        double s2= s.nextDouble();

        System.out.println("Enter operation: (+,-,*,/)");
        String op= s.next();


        switch (op){
            case "+":
                 res = s1 + s2;
                break;
            case "-":
               res=s1-s2;
                break;
            case "*":
               res=s1*s2;
                break;
            case "/":
                res=s1/s2;
                break;
            default:
                System.out.println("Invalid operator please check once again");

        }
        System.out.println("Result is: "+res);
    }
}
