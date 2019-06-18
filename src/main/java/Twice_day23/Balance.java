package Twice_day23;

import java.util.*;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    /**
     * 解决方法是使用递归，将问题单一化；
     * 将问题简单化为只需要求出左子树，右子树的高度，检查两者的差是否大于1
     * 在求子树高度时需要使用递归求解；同时也需要对根节点的遍历求解进行递归
     *
     * @param root
     * @return
     */
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null)
            return true;

        //获取左子树的高度
        int leftHeight = getHeight(root.left);
        //获取右子树的高度
        int righHeight = getHeight(root.right);
        //abs()返回绝对值
        if (Math.abs(leftHeight - righHeight) > 1){
            return false;
        }

        return isBalance(root.left) && isBalance(root.right);
    }

    private int getHeight(TreeNode node){
        if (node == null)
            return 0;
        return Math.max(getHeight(node.left),getHeight(node.right)) + 1;
    }
}