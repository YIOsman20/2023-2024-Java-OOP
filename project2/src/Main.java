import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        ProcessBuilder processBuilder1 = new ProcessBuilder("ls");
        processBuilder1.directory(new File("."));
        Process process1 = processBuilder1.start()

        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число за факториел: ");
        int num = scanner.nextInt();

        // Стартиране на процес за изчисление на факториел
        ProcessBuilder processBuilder2 = new ProcessBuilder("java", "FactorialCalculator", String.valueOf(num));
        Process process2 = processBuilder2.start();
        process2.waitFor();
    }
}