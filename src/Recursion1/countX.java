package Recursion1;

public class countX {

    public int countX(String str) {

        return countX(str, 0, 0);
    }

    public int countX(String str, int index, int count){
        if (index == str.length()){
            return count;
        }

        if (str.charAt(index)=='x'){
            return countX(str, index+1, count+1);
        }

        return countX(str, index+1, count);
    }

}
