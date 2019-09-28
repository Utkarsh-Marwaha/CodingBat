package String2;

public class getSandwich {

    public String getSandwich(String str) {

        String sub = "bread";
        int firstBread = str.indexOf(sub);
        int lastBread  = str.lastIndexOf(sub);

        if (firstBread != lastBread){
            return str.substring(firstBread + sub.length(), lastBread);
        }

        return "";
    }
}
