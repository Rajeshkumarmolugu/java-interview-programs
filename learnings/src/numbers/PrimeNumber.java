package learnings.src.numbers;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 28;
        boolean isPrime = true;
        for(int i = 2 ; i<n ; i++){
            if(n%i == 0){
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}
