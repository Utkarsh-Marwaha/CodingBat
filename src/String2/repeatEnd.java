package String2;

public class repeatEnd {

    public String repeatEnd(String str, int n) {

        StringBuilder builder = new StringBuilder();

        String lastNCharacters = str.substring(str.length() - n);

        for (int i = 0; i < n; i++){
            builder.append(lastNCharacters);
        }

        return builder.toString();
    }

}
