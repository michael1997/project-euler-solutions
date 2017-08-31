package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question6 {

    public static void main(String[] args){
        int num = 100;
        int sum_of_squares = 0;

        int square_of_sums = num*(num+1)/2 * num*(num+1)/2;

        for (int i = 1; i<=num; i++){
            sum_of_squares += i*i;
        }
        int result = square_of_sums - sum_of_squares;
        System.out.println(sum_of_squares);
        System.out.println(square_of_sums);
        System.out.println(result);



    }

}
