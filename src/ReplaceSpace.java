public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i ++) {
            if(str.charAt(i) == ' ') {
                builder.append("%20");
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

}
