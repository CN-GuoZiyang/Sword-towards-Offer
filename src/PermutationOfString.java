import java.util.ArrayList;
import java.util.Collections;

//TODO
public class PermutationOfString {

    private ArrayList<String> res = new ArrayList<>();

    public ArrayList<String> Permutation(String str) {
        if(str.length() == 0) return res;
        find(str, 0);
        Collections.sort(res);
        return res;
    }

    public void find(String str, int swapIndex) {
        if(swapIndex == str.length()-1) {
            res.add(str);
            return;
        }
        String tmpStr;
        char swapChar = str.charAt(swapIndex);
        for(int i = swapIndex; i < str.length(); i ++) {
            char tmpChar = str.charAt(i);
            if(i == swapIndex) {
                find(str, swapIndex+1);
            } else if(tmpChar != swapChar) {
                tmpStr = str.substring(0, swapIndex) + tmpChar + str.substring(swapIndex+1, i) + swapChar + str.substring(i+1);
                find(tmpStr, swapIndex+1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new PermutationOfString().Permutation("abc"));
    }

}
