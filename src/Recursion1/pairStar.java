package Recursion1;

public class pairStar {

    public String pairStar(String str) {

        if (str.equals("")){
            return str;
        }
        return pairStar(str, 0, new StringBuilder());
    }

    public String pairStar(String str, int index, StringBuilder nStr) {


        if (index == str.length()){
            return nStr.toString();
        }

        nStr.append(str.charAt(index));

        if (index + 1 < str.length() && str.charAt(index) == str.charAt(index+1)){
            nStr.append('*');
        }

        return pairStar(str, index + 1, nStr);
    }
}