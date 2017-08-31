package questions;

/**
 * Created by Michael on 02-Jul-16.
 */
public class question9 {

    public static void main(String[] args){
        int sum = 1000;
        int a;
        int b;
        int c;
        int m = 1;


        while (true){
            m += 1;
            for (int n = 1; n < m; n++ ){
                a = 2*m*n;
                b = m*m-n*n;
                c = m*m+n*n;
                if (sum % (a+b+c) == 0){
                    double result = Math.pow(sum/(a+b+c),3) *a*b*c;
                    System.out.println(result);
                    break;
                }
            }

        }
    }
}
