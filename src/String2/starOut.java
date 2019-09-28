package String2;

public class starOut {

    public String starOut(String str) {

        int[] charsToBeDeleted = new int[str.length()];

        StringBuilder builder = new StringBuilder(str.length());

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '*') {

                charsToBeDeleted[i] = 1;

                if(i - 1 >= 0) {
                    charsToBeDeleted[i-1] = 1;
                }
                if(i + 1 < str.length()) {
                    charsToBeDeleted[i+1] = 1;
                }
            }
        }

        for(int i = 0; i < str.length(); i++) {
            if(charsToBeDeleted[i] == 0) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
