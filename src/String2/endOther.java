package String2;

public class endOther {

    public boolean endOther(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        int posOfaInb = b.lastIndexOf(a);
        int posOfbIna = a.lastIndexOf(b);

        if (posOfaInb == -1 && posOfbIna == -1){
            return false;
        }

        return ((posOfaInb + a.length() == b.length())
                || (posOfbIna + b.length() == a.length()));
    }


}
