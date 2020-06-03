public class SerializeBinaryTree {

    String Serialize(TreeNode root) {
        if(root == null) {
            return "#,";
        }
        String res = root.val + ",";
        res += Serialize(root.left);
        res += Serialize(root.right);
        return res;
    }

    private int index = -1;

    TreeNode Deserialize(String str) {
        String[] strs = str.split(",");
        index = -1;
        return deserialize(strs);
    }

    TreeNode deserialize(String[] strs) {
        index ++;
        if("".equals(strs[index])) return null;
        if("#".equals(strs[index])) return null;
        TreeNode node = new TreeNode(Integer.parseInt(strs[index]));
        node.left = deserialize(strs);
        node.right = deserialize(strs);
        return node;
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
