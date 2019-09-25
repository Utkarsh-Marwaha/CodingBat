package Recursion1;

public class changeXY {

    public String changeXY(String str) {
        return changeXY(str, 0);
    }


    public String changeXY(String str, int index) {

        if (index == str.length()){
            return str;
        }

        if (str.charAt(index) =='x'){
            return changeXY(str.replace('x', 'y'), index+1);
        }

        return changeXY(str, index+1);
    }



}
