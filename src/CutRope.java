// TODO
public class CutRope {

    public int cutRope(int target) {
        int max=1;
        if(target<=3 && target>0){
            return target-1;
        }
        while(target>4){
            target-=3;
            max*=3;
        }
        return max*target;
    }


}
