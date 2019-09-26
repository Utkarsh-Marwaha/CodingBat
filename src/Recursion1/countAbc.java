package Recursion1;

public class countAbc {

    public int countAbc(String str) {

        return countAbc(str, 0, 0);
    }

    public int countAbc(String str, int fromIndex, int count) {

        if (fromIndex >= str.length()) {
            return count;
        }

        if ((str.indexOf("aba", fromIndex) == fromIndex) ||
                (str.indexOf("abc", fromIndex) == fromIndex)) {
            return countAbc(str, fromIndex + 1, count + 1);
        }

        return countAbc(str, fromIndex + 1, count);

    }
}
