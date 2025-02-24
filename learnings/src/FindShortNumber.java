package learnings.src;

public class FindShortNumber {
    public static void main(String[] args) {
        int[] num = {23,24,5,6,12,3,4};
        int temp = num[0];

        for(int i=1; i<num.length;i++){
            if(num[i] < temp){
                temp = num[i];
            }
        }
        System.out.println("Smallest number is " + temp);
    }
}
