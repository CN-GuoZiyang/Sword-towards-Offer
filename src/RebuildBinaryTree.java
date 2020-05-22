import java.util.Arrays;

public class RebuildBinaryTree {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0) return null;
        if(pre.length == 1) return new TreeNode(pre[0]);
        TreeNode treeNode = new TreeNode(pre[0]);
        int inIndex = -1;
        for(int i = 0; i < in.length; i ++) {
            if(in[i] == pre[0]) {
                inIndex = i;
                break;
            }
        }
        treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, inIndex+1), Arrays.copyOfRange(in, 0, inIndex));
        treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre, inIndex+1, pre.length), Arrays.copyOfRange(in, inIndex+1, in.length));
        return treeNode;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

}
