package Recursion1;

public class countPairs {

    public int countPairs(String str) {

        return countPairs(str, 0, 0);
    }

    public int countPairs(String str, int index, int count) {

        if (index == str.length()){
            return count;
        }

        if ( ((index + 2) < str.length()) && str.charAt(index) == str.charAt(index + 2)){
            return countPairs(str, index+1, count+1);
        }

        return countPairs(str, index+1, count);
    }
}
