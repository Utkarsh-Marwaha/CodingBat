package Recursion1;

public class countHi {

    public int countHi(String str) {

        return countHi(str, 0, 0);

    }

    public int countHi(String str, int fromIndex, int count) {

        if (fromIndex >= str.length()) {
            return count;
        }

        if (str.indexOf("hi", fromIndex) == fromIndex) {
            return countHi(str, fromIndex + 1, count + 1);
        }

        return countHi(str, fromIndex + 1, count);

    }
}