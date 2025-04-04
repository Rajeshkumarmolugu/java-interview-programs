package learnings.src.numbers;

import java.util.stream.LongStream;

public class FactorialOfNum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(LongStream.rangeClosed(1,n)
                .reduce(1, (a , b) -> a*b));
    }
}
