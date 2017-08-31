package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question4 {

    public static void main(String[] args){
        int i = 100;
        int j = 100;
        Integer test;
        Integer result = 0;
        while (i<1000) {
            i++;
            j = 100;
            while (j < 1000) {
                test = i * j;
                if (test.toString().equals(new StringBuilder(test.toString()).reverse().toString())) {
                    if (test > result) {
                        result = test;
                        System.out.println(result.toString());
                        System.out.println(i + " " + j);
                    }

                }
                j++;


            }
        }
        System.out.println(i + " " + j);

        System.out.println(result.toString());

    }
}
