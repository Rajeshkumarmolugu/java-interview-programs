package learnings.src;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 0,second=1;

        // 0,1,2,3,5,8,13,21

        for(int i =1 ; i<=n ;i++){
            System.out.print((i != n) ? first + "," : first);
            int next = first + second;
            first = second;
            second = next;
        }


    }

    public class FibonacciRecursive {
        public static int fibonacci(int n) {
            if (n <= 1) return n; // Base case
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int n = 10; // Generate first 10 Fibonacci numbers
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }
}
