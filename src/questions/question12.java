package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question12 {

    public static void main(String[] args){
        int num = 0;
        int sum = 0;
        int temp_num;
        int divisors = 2;
        while(divisors < 500){
            divisors = 2;
            num++;
            sum += num;
            temp_num = num;
            for(int i = 2; i < Math.sqrt(sum); i++){
                if(sum%i == 0){
                    divisors += 2;
                }
            }
        }
        System.out.println(Integer.toString(sum));
    }
}
