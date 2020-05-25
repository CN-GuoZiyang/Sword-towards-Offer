//TODO
public class ConvertBinaryTreeToLinkedList {

    private TreeNode last;

    public TreeNode Convert(TreeNode root) {
        if(root == null) return null;
        if(root.left == null && root.right == null) {
            last = root;
            return root;
        }
        TreeNode left = Convert(root.left);
        if(left != null) {
            last.right = root;
            root.left = last;
        }
        last = root;
        TreeNode right = Convert(root.right);
        if(right != null) {
            root.right = right;
            right.left = root;
        }
        return left == null ? root : left;
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
