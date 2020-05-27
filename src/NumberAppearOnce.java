public class NumberAppearOnce {

    public void FindNumsAppearOnce(int [] array, int num1[], int num2[]) {

        if(array == null || array.length < 2) return;
        int tmp = array[0];
        for(int i = 1; i < array.length; i ++) {
            tmp ^= array[i];
        }
        int firstOne = findFirstOne(tmp);
        num1[0] = 0;
        num2[0] = 0;
        for(int i = 0; i < array.length; i ++) {
            if(hasOneOnDigit(array[i], firstOne)) num1[0] ^= array[i];
            else num2[0] ^= array[i];
        }

    }

    // 寻找最高位上的1，返回位数
    private int findFirstOne(int num) {
        int count = 0;
        while (num != 0) {
            num = num >> 1;
            count ++;
        }
        return count;
    }

    private boolean hasOneOnDigit(int num, int digit) {
        for(int i = 0; i < digit-1; i ++) {
            num = num >> 1;
        }
        return (num & 1) == 1;
    }

}
