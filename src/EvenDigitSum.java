public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(22));
        System.out.println(getEvenDigitSum(345867));
        System.out.println(getEvenDigitSum(-12));
        System.out.println(getEvenDigitSum(11));
    }
    public static int getEvenDigitSum(int number){

        int even = 0;
        int num;

        if(number < 0){
            return -1;
        }
        for(num = number; num>0; num = num/10){
            int r = num%10;
            if(r%2 == 0){
                even = even + r;
            }
        }
        return even;
    }
}
