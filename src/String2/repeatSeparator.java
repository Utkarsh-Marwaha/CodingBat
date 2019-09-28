package String2;

public class repeatSeparator {

    public String repeatSeparator(String word, String sep, int count) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++){
            builder.append(word);

            if (i!=count-1){
                builder.append(sep);
            }

        }

        return builder.toString();

    }

}
