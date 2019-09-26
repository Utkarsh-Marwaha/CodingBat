package Recursion1;

public class countHi2 {
    public int countHi2(String str) {
        return countHi2(str, 0, 0);

    }

    public int countHi2(String str, int fromIndex, int count) {

        if (fromIndex >= str.length()) {
            return count;
        }

        if (fromIndex == 0){
            if (str.indexOf("hi", fromIndex) == fromIndex){
                return countHi2(str, fromIndex + 1, count + 1);
            }
        }

        else if ( (fromIndex - 1 >= 0) && str.charAt(fromIndex - 1) != 'x' &&
                str.indexOf("hi", fromIndex) == fromIndex) {
            return countHi2(str, fromIndex + 1, count + 1);
        }

        return countHi2(str, fromIndex + 1, count);
    }
}
