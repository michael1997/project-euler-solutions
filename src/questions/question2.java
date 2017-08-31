package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question2 {

    public static void main(String[] args){
        Integer cap = 4000000;
        int f1 = 1;
        int f2 = 2;
        Integer sum = 0;
        int tempf1;
        while(f2<cap){
            if (f2%2 == 0) {
                sum += f2;
            }
            tempf1 = f2;
            f2 = f1+f2;
            f1 = tempf1;
        }
        System.out.println(sum.toString());
    }

}
