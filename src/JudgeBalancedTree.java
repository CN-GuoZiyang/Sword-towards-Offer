// 左子树与右子树的高度差最大为1
public class JudgeBalancedTree {

    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;
        int left = judge(root.left);
        if(left == -1) return false;
        int right = judge(root.right);
        if(right == -1) return false;
        return Math.abs(left - right) <= 1;
    }

    public int judge(TreeNode root) {
        if(root == null) return 0;
        int left = judge(root.left);
        if(left == -1) return -1;
        int right = judge(root.right);
        if(right == -1) return -1;
        if(Math.abs(left-right) > 1) return -1;
        return Math.max(left, right)+1;
    }

    class TreeNode {
        TreeNode left;
        TreeNode right;
    }

}
