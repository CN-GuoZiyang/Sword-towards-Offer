import java.util.Arrays;
import java.util.Comparator;

public class SortArrayToMin {

    public String PrintMinNumber(int [] numbers) {
        String[] strs = new String[numbers.length];
        for(int i = 0; i < strs.length; i ++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < strs.length; i ++) {
            builder.append(strs[i]);
        }
        return builder.toString();
    }

}
