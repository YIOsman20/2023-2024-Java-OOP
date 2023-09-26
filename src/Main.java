public class Main {
    public static void main(String[] args)
    {

       double finalResult = addTwoNumbers(10,2.5);
    recursion();
    }
    public static double addTwoNumbers(int first, double second)
    {
        double result = first+second;
        return result;
    }
    public static void recursion(){
        recursion();
    }
    public static void printText(String text)
    {
        int a =5;
        System.out.println(text + " " +a);
        a++;

    }
    public static void printTest()
    {

        System.out.println("test");
        test();

    }

    public static void  test()
    {
        System.out.println("testing..");
    }
}