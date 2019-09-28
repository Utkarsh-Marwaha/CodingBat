package String2;

public class sameStarChar {

    public boolean sameStarChar(String str) {

        char beforeStar = ' ';
        char afterStar  = ' ';
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '*'){

                beforeStar = ' ';
                afterStar  = ' ';

                if (i - 1 >=0){
                    beforeStar = str.charAt(i-1);
                }
                if (i + 1 < str.length()){
                    afterStar = str.charAt(i+1);
                }

                if (beforeStar != ' ' && afterStar != ' ' && beforeStar != afterStar){
                    return false;
                }
            }
        }
        return true;
    }

}
