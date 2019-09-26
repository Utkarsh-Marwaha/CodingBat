package Recursion1;

public class count11 {

    public int count11(String str) {
        return count11(str, 0, 0);

    }

    public int count11(String str, int fromIndex, int count) {

        if (fromIndex >= str.length()) {
            return count;
        }

        if (str.indexOf("11", fromIndex) == fromIndex) {
            return count11(str, fromIndex + 2, count + 1);
        }

        return count11(str, fromIndex + 1, count);
    }
}
