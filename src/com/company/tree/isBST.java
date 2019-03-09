package com.company.tree;

public class isBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBSTUtils(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    private boolean isValidBSTUtils(TreeNode root, long minValue, long maxValue) {
        if(root == null)
            return true;
        return (long) root.val > minValue && (long) root.val < maxValue
                && isValidBSTUtils(root.left, minValue, root.val)
                && isValidBSTUtils(root.right, root.val, maxValue);
    }
}

