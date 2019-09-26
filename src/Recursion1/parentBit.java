package Recursion1;

public class parentBit {
    public String parenBit(String str) {

        StringBuilder builder = new StringBuilder();
        return parenBit(str, 0, builder, false);
    }

    public String parenBit(String str, int index, StringBuilder builder, boolean collect) {

        if (str.charAt(index) == ')'){
            return builder.toString() + ')';
        }

        if (collect) {
            return parenBit(str,index+1, builder.append(str.charAt(index)), true);
        }
        if (str.charAt(index)=='('){
            return parenBit(str,index+1, builder.append(str.charAt(index)), true);
        }
        return parenBit(str,index+1, builder, collect);
    }
}
