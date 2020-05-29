//TODO 约瑟夫环公式法
public class ChildrenGame {

    public int LastRemaining_Solution(int n, int m) {
        if(n==0)
            return -1;
        if(n==1)
            return 0;
        else
            return (LastRemaining_Solution(n-1,m)+m)%n;
    }

}
