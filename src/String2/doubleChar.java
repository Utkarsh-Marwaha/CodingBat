package String2;

public class doubleChar {

    public String doubleChar(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            builder.append(str.charAt(i));
            builder.append(str.charAt(i));
        }

        return builder.toString();
    }

}
