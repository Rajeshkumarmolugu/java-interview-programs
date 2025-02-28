package learnings.src.numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(F(11));

    }

    public static int F(int n){
        if(n <= 1){
            return n;
        } else {
            return F(n-1) + F(n-2);
        }
    }
}
