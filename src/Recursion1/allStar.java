package Recursion1;

public class allStar {

    public String allStar(String str) {

        if (str.equals("")){
            return str;
        }
        return allStar(str, 0, new StringBuilder());
    }

    public String allStar(String str, int index, StringBuilder nStr) {


        if (index == str.length()){
            return nStr.toString().substring(0, nStr.length()-1);
        }
        nStr.append(str.charAt(index));
        nStr.append('*');

        return allStar(str, index + 1, nStr);
    }

}
