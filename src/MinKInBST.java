public class MinKInBST {

    private int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {

        if(pRoot == null) return null;
        if(k < 1) return null;
        TreeNode res = find(pRoot, k);
        return res;
    }

    TreeNode find(TreeNode node, int k) {
        TreeNode tmp = null;
        if(node.left != null) {
            tmp = find(node.left, k);
        }
        if(tmp != null) return tmp;
        index ++;
        if(index == k) return node;
        if(node.right != null) {
            tmp = find(node.right, k);
        }
        return tmp;
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
