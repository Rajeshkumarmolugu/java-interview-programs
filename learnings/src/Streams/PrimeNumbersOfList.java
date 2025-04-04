package learnings.src.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbersOfList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));

        al.stream().filter(PrimeNumbersOfList::isPrime).forEach(System.out::println);

    }
    public static boolean isPrime(Integer n){
        Boolean isPrime = true;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
