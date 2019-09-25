package Recursion1;

public class changePi {

    public String changePi(String str) {
        return changePi(str, 0);
    }

    public String changePi(String str, int index) {

        if (index == str.length()){
            return str;
        }

        if (str.indexOf("pi", index) == index){
            return changePi(str.replace("pi", "3.14"), index+1);
        }

        return changePi(str, index+1);
    }

}
