package Algorithm.unit1;

import java.util.ArrayList;

/**
 * 230.
 * 250. 统计同值子树
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    private static int gk;
    int num;

    public static void main(String[] args) {

//        TreeNode treeNode = new TreeNode(5);
//        treeNode.left = new TreeNode(3);
//        treeNode.right = new TreeNode(6);
//        treeNode.left.left = new TreeNode(2);
//        treeNode.left.right = new TreeNode(4);
//        treeNode.left.left.left = new TreeNode(1);
//        System.out.println(kthSmallest(treeNode, 3));
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.right = new TreeNode(5);
//        System.out.println(this.countUnivalSubtrees(treeNode));

    }

    public int countUnivalSubtrees(TreeNode root) {

        if (root == null) {
            return 0;
        }
        count(root);
        return num;
    }

    public boolean count(TreeNode node) {
        if (node.left == null && node.right == null) {
            num++;
            return true;
        }
        boolean isUnival = true;
        if (node.left != null) {
            isUnival = count(node.left) && isUnival && (node.left.val == node.val);
        }
        if (node.right != null) {
            isUnival = count(node.right) && isUnival && (node.right.val == node.val);
        }
        if (!isUnival) {
            return false;
        }
        num++;
        return true;
    }

    public static int kthSmallest(TreeNode root, int k) {
        gk = k;
        ArrayList<Integer> arrayList = inorder(root, new ArrayList<>());
        return arrayList.get(k-1);
    }

    public static ArrayList<Integer> inorder(TreeNode node, ArrayList<Integer> arr) {
        if (node == null) {
            return arr;
        }
        inorder(node.left, arr);
        if (arr.size() > gk) {
            return arr;
        }
        arr.add(node.val);
        if (arr.size() > gk) {
            return arr;
        }
        inorder(node.right, arr);
        return arr;
    }

}
