package String2;

public class plusOut {

    public String plusOut(String str, String word) {

        int[] charsToBeRetained = new int[str.length()];

        StringBuilder builder = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(word, i) == i) {
                for (int j = i; j < word.length() + i; j++) {
                    charsToBeRetained[j] = 1;
                }
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (charsToBeRetained[i] == 0) {
                builder.append('+');
            } else if (charsToBeRetained[i] == 1) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}

