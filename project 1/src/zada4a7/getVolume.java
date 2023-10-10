package zada4a7;

import java.util.Scanner;

public class getVolume
{
    public static double getVolumeM(int r,int h,double pi)
    {
        return pi*r*r*h;
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int r;
        int h;
        double pi = 3.14;
        System.out.print("Enter r: ");
        r = scanner.nextInt();
        System.out.print("\nEnter h: ");
        h = scanner.nextInt();
        System.out.print("\nV = "+ getVolumeM(r,h,pi) );
    }
}
