package Recursion1;

public class strCopies {
    public boolean strCopies(String str, String sub, int n) {
        return strCopies(str, 0, 0, sub, n);

    }

    public boolean strCopies(String str, int fromIndex, int count, String sub, int n) {

        if (fromIndex >= str.length()) {
            return count == n;
        }

        if (str.indexOf(sub, fromIndex) == fromIndex) {
            return strCopies(str, fromIndex + 1, count + 1, sub, n);
        }

        return strCopies(str, fromIndex + 1, count, sub, n);

    }
}
