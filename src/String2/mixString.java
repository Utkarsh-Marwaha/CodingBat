package String2;

public class mixString {

    public  String mixString(String a, String b) {

        StringBuilder builder = new StringBuilder();

        int commonLen = Math.min(a.length(), b.length());

        int i = 0;
        for (int index = i; index < commonLen; index++){
            builder.append(a.charAt(index));
            builder.append(b.charAt(index));
        }


        if (a.length() > b.length()){
            for (int index = commonLen; index < a.length(); index++){
                builder.append(a.charAt(index));
            }
        }
        else if (b.length() > a.length()){
            for (int index = commonLen; index < b.length(); index++){
                builder.append(b.charAt(index));
            }
        }

        return builder.toString();
    }

}
