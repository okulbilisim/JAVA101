package javaBasicPackage;

import java.util.Scanner;

/*
Instructors
    define 2 variables(int) and names are number1 and number2
    create 4 diferent method to make calculation
    substraction
    summation
    divide
    multiplication
    we will create a user menu to select which calculation prefer.
*/
public class JavaBasics {

    public static void main(String[] args) {

        //Define variables
        int number1, number2;
        int choice;
        Scanner a = new Scanner(System.in);
        
        
        menu();
        System.out.print("Enter your value : ");
        choice = a.nextInt();


        while(choice != 0){
            if (choice == 1)
            {
                System.out.println("Enter number1 : ");
                number1 = a.nextInt();
                System.out.println("Enter number2 : ");
                number2 = a.nextInt();
                System.out.println("The result is "+ 
                        Sum(number1, number2));
                menu();
                System.out.print("Enter your value : ");
                choice = a.nextInt();
            }
            
            if (choice == 2)
            {
                System.out.println("Enter number1 : ");
                number1 = a.nextInt();
                System.out.println("Enter number2 : ");
                number2 = a.nextInt();
                System.out.println("The result is "+ 
                        Sub(number1, number2));
                menu();
                System.out.print("Enter your value : ");
                choice = a.nextInt();
            }
            
            if (choice == 3)
            {
                System.out.println("Enter number1 : ");
                number1 = a.nextInt();
                System.out.println("Enter number2 : ");
                number2 = a.nextInt();
                System.out.println("The result is "+ 
                        Multiplication(number1, number2));
                menu();
                System.out.print("Enter your value : ");
                choice = a.nextInt();
            }
            
            if (choice == 4)
            {
                System.out.println("Enter number1 : ");
                number1 = a.nextInt();
                System.out.println("Enter number2 : ");
                number2 = a.nextInt();
                System.out.println("The result is "+ 
                        Divition(number1, number2));
                menu();
                System.out.print("Enter your value : ");
                choice = a.nextInt();
            }
        }
    }

    public static void menu()
    {
        System.out.println("\t\tCalculation Menu");
        System.out.println("Select one of them");
        System.out.println("1 for Summation");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multipliction");
        System.out.println("4 for Divition");
        System.out.println("0 for Exit");
    }

    public static int Sum(int x, int y){
        return x+y;
    }

    public static int Sub(int x, int y){
        return x-y;
    }
    public static int Multiplication(int x, int y){
        return x*y;
    }

    public static int Divition (int x, int y){
        if(y == 0)
        {
            System.out.println("Undefined result!!!");
            return 0;
        }
        else
            return x/y;
    }

}
