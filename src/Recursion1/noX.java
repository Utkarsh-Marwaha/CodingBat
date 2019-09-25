package Recursion1;

public class noX {

    public String noX(String str) {
        return noX(str, 0 , new StringBuilder());
    }


    public String noX(String str, int index, StringBuilder nStr) {

        if (index == str.length()){
            return nStr.toString();
        }

        if (str.charAt(index) =='x'){
            return noX(str, index+1, nStr);
        }

        return noX(str, index+1, nStr.append(str.charAt(index)));
    }
}
