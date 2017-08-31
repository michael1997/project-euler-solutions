package questions;

/**
 * Created by Michael on 14-Jul-16.
 */
public class question14 {

    public static void main(String[] args){
        int max_length = 0;
        int length;
        long  num = 0;
        long test;
        for (int i = 1; i<1000000; i++){
            if (i%1000000==0) {
                System.out.println(i);
            }
            length = 0;
            test = i;
            while(test!=1){
                if (isEven(test)){
                    test /= 2;
                }
                else{
                    test = test*3 + 1;
                }
                length++;
            }
            if (length>max_length){
                max_length=length;
                num = i;
            }
        }
        System.out.println(num);
    }

    private static boolean isEven(long n){
        return n%2==0;
    }


}
