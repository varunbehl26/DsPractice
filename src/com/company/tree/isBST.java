package com.company.tree;

public class isBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBSTUtils(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }


    private boolean isValidBSTUtils(TreeNode root, long minValue, long maxValue) {
        if (root == null)
            return true;
        return (long) root.value > minValue && (long) root.value < maxValue
                && isValidBSTUtils(root.left, minValue, root.value)
                && isValidBSTUtils(root.right, root.value, maxValue);
    }
}

