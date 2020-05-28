import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 阿里一面
// 题目：给n个有序字符串(仅小写字母,ASCII序递增),求所能拼接的最长有序子串的长度。
// 例如["aaa","bcd","zzz","bcdef","def"]
// 所能拼接出的最长有序子串为aaa,bcd,def,zzz拼接出的aaabcddefzzz长度为12
public class MaxIncreasingString {

    public int maxLength(String[] strs) {

        List<String> list = new ArrayList<>(Arrays.asList(strs));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(o1.length()-1)==o2.charAt(o2.length()-1)?o1.charAt(0)-o2.charAt(0):o1.charAt(o1.length()-1)-o2.charAt(o2.length()-1);
            }
        });
        int[] dp = new int[26];
        int res = 0;
        for(String str : list) {
            char end = str.charAt(str.length()-1);
            char start = str.charAt(0);
            int max = 0;
            for(int j = 0; j <= start-'a'; j ++) {
                max = Math.max(max, dp[j]);
            }
            dp[end - 'a'] = max + str.length();
            res = Math.max(res, dp[end-'a']);
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new MaxIncreasingString().maxLength(new String[]{"aaa","bcd","zzz","bcdef","def"}));
        System.out.println(new MaxIncreasingString().maxLength(new String[]{"bcde", "aa", "aaa", "aab", "aaab", "bcf", "acdf"}));
    }

}
