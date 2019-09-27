package String2;

public class countHi {

    public int countHi(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.indexOf("hi", i) == i) {
                count++;
            }


        }
        return count;
    }

}
