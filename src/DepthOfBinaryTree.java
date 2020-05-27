public class DepthOfBinaryTree {

    private int maxDepth = 0;
    private int tmp = 0;

    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return maxDepth;
    }

    private void dfs(TreeNode node) {
        if(node == null) return;
        tmp ++;
        if(node.left == null && node.right == null) {
            maxDepth = Math.max(tmp, maxDepth);
            tmp --;
            return;
        }
        dfs(node.left);
        dfs(node.right);
        tmp --;
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
