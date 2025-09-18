package learnings.src.numbers;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =11;
        for(int i=0;i<=n;i++){
            System.out.print(F(i) + " ");
        }


    }

    public static int F(int n){
        if(n <= 1){
            return n;
        } else {
            return F(n-1) + F(n-2);
        }
    }
}
