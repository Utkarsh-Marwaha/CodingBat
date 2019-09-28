package String2;

public class xyzThere {

    public boolean xyzThere(String str) {

        boolean found = false;

        for (int i = 0; i < str.length(); i++){
            if (str.indexOf("xyz", i) == i) {

                if (i-1 >=0){
                    if (str.charAt(i-1) != '.'){
                        found = true;
                        break;
                    }
                } else {
                    return true;
                }
            }
        }
        return found;
    }

}
