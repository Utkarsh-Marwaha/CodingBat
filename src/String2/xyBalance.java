package String2;

public class xyBalance {

    public boolean xyBalance(String str) {

        boolean balance = true;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){

                while (i < str.length() - 1 && str.charAt(i) != 'y'){
                    i++;
                }

                if (str.charAt(i) == 'y'){
                    balance = true;
                } else{
                    return false;
                }
            }
        }

        return balance;
    }
}
