public class FirstCharAppearsOnce {

    public int FirstNotRepeatingChar(String str) {
        int[] times = new int[129]; // ASCII共128个
        for(int i = 0; i < str.length(); i ++) {
            times[str.charAt(i)] ++;
        }
        for(int i = 0; i < str.length(); i ++) {
            if(times[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }

}
