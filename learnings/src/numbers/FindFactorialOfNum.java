package learnings.src.numbers;

public class FindFactorialOfNum {

    static long factorial(int n) {
        if ( n ==0 ){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        int num=1;

        //option 1
        for (int i =1; i<=n ; i++){
            num = num * i;
        }

        System.out.println(num);

        //Option 2 with Recursive
        System.out.println(factorial(n));
    }



}
