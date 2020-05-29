//TODO
public class PlusOneToN {

    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (n > 0) && (sum += Sum_Solution(--n))>0;
        return sum;
    }

}
