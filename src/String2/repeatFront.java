package String2;

public class repeatFront {

    public String repeatFront(String str, int n) {
        return repeatFront(str, n, new StringBuilder());
    }

    public String repeatFront(String str, int n, StringBuilder builder) {

        if (n == 0){
            return builder.toString();
        }

        String firstNChars = str.substring(0, n);

        return repeatFront(str, n-1, builder.append(firstNChars));

    }

}
