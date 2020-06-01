public class ConvertStringToInteger {

    public int StrToInt(String str) {
        if(str == null || str.length() == 0) return 0;
        if("0".equals(str)) return 0;
        int length = str.length();
        long tmp = 0;
        int index = 0;
        boolean negative = false;
        if(str.charAt(index) == '-') {
            negative = true;
            index ++;
        } else if (str.charAt(index) == '+') {
            index ++;
        }
        for(;index < length; index ++) {
            if(isNum(str.charAt(index))) {
                tmp = tmp * 10 + (str.charAt(index)-'0');
                System.out.println(tmp);
            } else {
                return 0;
            }
        }
        if(negative) return (int) (-tmp);
        else return (int) tmp;
    }

    private boolean isNum(char c) {
        return c <= '9' && c >= '0';
    }

    public static void main(String[] args) {
        System.out.println(new ConvertStringToInteger().StrToInt("-2147483649"));

    }

}
