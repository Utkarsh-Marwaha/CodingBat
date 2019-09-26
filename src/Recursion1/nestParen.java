package Recursion1;

public class nestParen {
    public boolean nestParen(String str) {
        return nestParen(str, 0, str.length()-1);
    }

    public boolean nestParen(String str, int startIndex, int endIndex){
        if (startIndex > endIndex){
            return true;
        }

        if (str.charAt(startIndex) == '(' && str.charAt(endIndex) == ')'){
            return nestParen(str, startIndex + 1, endIndex - 1);
        }

        return false;
    }
}
