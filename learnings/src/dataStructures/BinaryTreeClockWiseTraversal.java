package learnings.src.dataStructures;

import com.sun.source.tree.Tree;

public class BinaryTreeClockWiseTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        printClockWise(root);
    }

    private static void printClockWise(TreeNode root) {
        if(root == null)
            return;

        System.out.println(root.data);

        printRightBoundary(root.right);
        printLeaves(root.right);
        printLeaves(root.left);
        printLeftBoundaryBottomUp(root.left);
    }

    private static void printLeftBoundaryBottomUp(TreeNode node) {
        if(node == null || (node.left == null && node.right == null))
            return;
        if(node.left !=null)
        printLeftBoundaryBottomUp(node.left);
        else
            printLeftBoundaryBottomUp(node.right);
        System.out.println(node.data);

    }

    private static void printLeaves(TreeNode node) {
        if(node == null)
            return;
        printLeaves(node.right);

        if(node.left == null && node.right == null)
            System.out.println(node.data);

        printLeaves(node.left);
    }

    private static void printRightBoundary(TreeNode node) {
        if(node == null || (node.left == null && node.right == null))
            return;
        System.out.println(node.data);

        if (node.right != null)
            printRightBoundary(node.right);
        else
            printRightBoundary(node.left);
    }


}

class TreeNode{

    int data;
    TreeNode left, right;

    TreeNode(int data){
        this.data=data;
    }

}
