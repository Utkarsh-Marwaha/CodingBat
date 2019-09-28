package String2;

public class wordEnds {

    public static String wordEnds(String str, String word) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(word, i) == i) {

                if (i - 1 >= 0){
                    builder.append(str.charAt(i-1));
                }


                if (i + word.length() < str.length()){
                    builder.append(str.charAt(i + word.length()));
                }
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("XYXY", "XY"));
    }

}
