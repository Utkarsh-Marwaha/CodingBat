package String2;

public class zipZap {

    public String zipZap(String str) {

        StringBuilder builder = new StringBuilder(str);

        for(int i = 0; i < builder.length() - 2; i++){
            if(builder.charAt(i) == 'z' && builder.charAt(i+2) == 'p'){
                builder.deleteCharAt(i+1);
            }
        }

        return builder.toString();
    }
}
