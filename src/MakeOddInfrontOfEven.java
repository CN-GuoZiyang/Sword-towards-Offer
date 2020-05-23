
// 要求有序
// 经典可以用两个Queue，保证稳定，拿空间换时间
// 这里使用类似于插入排序的思想
public class MakeOddInfrontOfEven {
    public void reOrderArray(int [] array) {
        int length = array.length;
        // 已经安排好位置的奇数个数
        int k = 0;
        for(int i = 0; i < length; i ++) {
            if(array[i]%2==1) {
                // 当前数为奇数，移动到k+1的位置
                int j = i;
                while(j >= k + 1) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                    j--;
                }
                k ++;
            }
        }
    }
}
