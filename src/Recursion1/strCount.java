package Recursion1;

public class strCount {
    public int strCount(String str, String sub) {
        return strCount(str, 0, 0, sub);

    }

    public int strCount(String str, int fromIndex, int count, String sub) {

        if (fromIndex >= str.length()) {
            return count;
        }

        if (str.indexOf(sub, fromIndex) == fromIndex) {
            return strCount(str, fromIndex + sub.length(), count + 1, sub);
        }

        return strCount(str, fromIndex + 1, count, sub);

    }

}
