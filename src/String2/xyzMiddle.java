package String2;

public class xyzMiddle {

    public boolean xyzMiddle(String str) {

        String sub = "xyz";
        for (int i = 0; i < str.length(); i++){
            if (str.indexOf(sub, i) == i) {
                int diff = Math.abs(str.length() - (i + sub.length()) - i);
                if (diff <=1){
                    return true;
                }
            }
        }

        return false;
    }

}
