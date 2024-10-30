import java.util.Scanner;

public class FibonacciSeries {


    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of iterations in Fibonacci series: ");
        int count = scanner.nextInt();

        System.out.print("Fibonacci series: ");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    
    }
    
}
