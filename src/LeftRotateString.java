public class LeftRotateString {

    public String LeftRotateString(String str, int n) {
        if(str == null) return null;
        if(str.length() < 2) return str;
        n = n % str.length();
        return str.substring(n) + str.substring(0, n);
    }

}
