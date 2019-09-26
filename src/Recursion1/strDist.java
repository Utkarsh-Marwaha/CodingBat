package Recursion1;

public class strDist {

    public int strDist(String str, String sub) {

        return strDist(str, sub, 0, 0);
    }

    public int strDist(String str, String sub, int index, int dist) {

        if (index == str.length()){
            return dist;
        }

        int lastIndex = str.lastIndexOf(sub);

        int firstIndex = str.indexOf(sub, index);

        if (lastIndex != -1 && firstIndex != -1 && lastIndex - firstIndex >= dist){
            dist = (lastIndex - firstIndex) + sub.length();
            return strDist(str, sub, firstIndex + sub.length(), dist);
        }

        return strDist(str, sub, index + 1, dist);
    }
}
