package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question1 {

    public static void main(String[] args){
        Integer num = 999;
        float result = sum_of_multiples_n(num, 5) + sum_of_multiples_n(num, 3)
               - sum_of_multiples_n(num, 15);
        //result = sum_of_multiples_n(num, 5);
        System.out.println("");
        System.out.println(result);
    }

    private static float sum_of_multiples_n(Integer n, Integer r){
        float number = n;
        while (!(number % r == 0)){
            number -= 1;
        }


        if (number == 0){
            return 0;
        }
        return number/r/2 * (number + r);

    }
}

