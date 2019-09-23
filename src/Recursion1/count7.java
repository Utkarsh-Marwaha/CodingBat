package Recursion1;

public class count7 {
    public int count7(int n) {

        //base case
        if (n==0) {
            return 0;
        }

        // find the rightmost digit
        int r_digit = n % 10;

        if (r_digit == 7){
            return 1 + count7(n/10);
        } else{
            return count7(n/10);
        }

    }
}
