package String2;

public class oneTwo {

    public String oneTwo(String str) {

        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < str.length(); i+=3){

            if (i + 3 <= str.length()){
                builder.append(str.substring(i+1, i+3));
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

}
