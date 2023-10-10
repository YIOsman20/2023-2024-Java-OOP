package zada4a5;

public class FactorialCalculator {
    public static long calculateFactorial(int n) {

        if (n == 0 || n == 1) {

            return 1;

        } else {

            return n * calculateFactorial(n - 1);

        }

    }



    public static void main(String[] args) {

        int number = 5;

        long factorial = calculateFactorial(number);



        System.out.println("Факториел от " + number + " е " + factorial);

    }
}
