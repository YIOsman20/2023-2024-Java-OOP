package zada4a6;

import java.util.Scanner;

public class calculator
{
    public static  int addition(int a,int b)
    {
        return  a + b;
    }
    public static  int subtraction(int a,int b)
    {
        return  a-b;
    }
    public  static int multiplication(int a,int b)
    {
        return a * b;
    }
    public static int division(int a,int b)
    {
        return a / b;
    }
    public static int divisionRemains(int a,int b)
    {
        return a % b;
    }

    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int b = scanner.nextInt();
        System.out.print("a + b = " + addition(a,b) + "\n");
        System.out.print("a - b = " + subtraction(a,b) + "\n");
        System.out.print("a * b = " + multiplication(a,b)+"\n");
        System.out.print("a / b = " + division(a,b) + "\n");
        System.out.print("a % b = " + divisionRemains(a,b));
    }
}
