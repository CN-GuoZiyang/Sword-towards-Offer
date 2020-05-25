import java.util.ArrayList;

public class PathOfSumInBinaryTree {

    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    private ArrayList<Integer> tmp = new ArrayList<>();
    private Integer tmpSum = 0;

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null) return new ArrayList<>();
        BST(root, target);
        return res;
    }

    public void BST(TreeNode root, int target) {
        tmp.add(root.val);
        tmpSum += root.val;
        if(tmpSum == target && root.left == null && root.right == null) {
            res.add(new ArrayList<>(tmp));
            tmpSum -= root.val;
            tmp.remove(tmp.size()-1);
            return;
        }
        for(int i = 0; i < 2; i ++) {
            TreeNode node = i==0?root.left:root.right;
            if(node == null) continue;
            if(tmpSum + node.val > target) continue;
            BST(node, target);
        }
        tmpSum -= root.val;
        tmp.remove(tmp.size()-1);
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
