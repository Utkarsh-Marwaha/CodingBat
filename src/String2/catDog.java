package String2;

public class catDog {

    public boolean catDog(String str) {

        int catCount = countSubString(str, "cat");
        int dogCount = countSubString(str, "dog");

        return catCount == dogCount;
    }


    public int countSubString(String str, String sub) {

        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.indexOf(sub, i) == i) {
                count++;
            }
        }
        return count;
    }
}
