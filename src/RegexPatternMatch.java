// TODO
public class RegexPatternMatch {

    public boolean match(char[] str, char[] pattern) {
        if(str == null || pattern == null) return false;
        return match1(str, pattern, 0, 0);
    }

    // 表示从sIndex到最后的str串和从pIndex开始到最后的pattern是否能匹配
    private boolean match1(char[] str, char[] pattern, int sIndex, int pIndex) {
        if(pIndex == pattern.length) {
            return sIndex == str.length;
        }
        if(pIndex == pattern.length-1 || pattern[pIndex+1]!='*') {
            return sIndex!=str.length && (str[sIndex]==pattern[pIndex] || pattern[pIndex]=='.') && match1(str, pattern, sIndex+1, pIndex+1);
        }
        int i = sIndex;
        while(i != str.length && (str[i] == pattern[pIndex] || pattern[pIndex] == '.')) {
            if(match1(str, pattern, i+1, pIndex+2)) {
                return true;
            }
            i ++;
        }
        return match1(str, pattern, sIndex, pIndex+2);
    }

}
