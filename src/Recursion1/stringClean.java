package Recursion1;

public class stringClean {

    public String stringClean(String str) {

        return stringClean(str, 0);
    }

    public String stringClean(String str, int index) {

        if (index == str.length()){
            return str;
        }

        if ( ((index + 1) < str.length()) && str.charAt(index) == str.charAt(index + 1)){
            return stringClean(str.substring(0, index) + str.substring(index+1), index);
        }

        return stringClean(str, index+1);
    }


}
