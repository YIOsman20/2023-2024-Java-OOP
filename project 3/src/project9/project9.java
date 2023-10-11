package project9;
import java.util.Scanner;
public class project9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int c,f;
        int choice;

        System.out.println("1. C->F");
        System.out.println("2. F->C");
        choice = input.nextInt();
        if(choice == 2)
        {
            System.out.println("F = ");
            f = input.nextInt();
            System.out.println("F = ");
        }
        else if(choice == 1)
        {
            System.out.println("C = ");
            c = input.nextInt();
        }
    }

}