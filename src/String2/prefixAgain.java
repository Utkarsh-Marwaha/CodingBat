package String2;

public class prefixAgain {

    public boolean prefixAgain(String str, int n) {


        String prefix = str.substring(0, n);
        return (str.indexOf(prefix) != str.lastIndexOf(prefix));
    }

}
