/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class CountGoodNodesinaBinaryTree {
    public int goodNodes(TreeNode root) {
        //Test edge case before using algorithm
        if (root == null) {
            return 0;
        }

        //Recurse from the left and right subtrees. Add one because the root node always
        //Meets the stated conditions
    
        return 1 + recurseDFS(root.left, root.val) + recurseDFS(root.right, root.val);
        
    }

    //recurse DFS counts how many 'good' nodes appear in a DFS traversal of a subtree
    int recurseDFS(TreeNode root, int min) {
        //Recursion ends at null 
        if (root == null) {
            return 0;
        }
        //If the maximum value reached in the DFS towards a node is bigger than the 
        //traversed node's value, add 0 to the count and continue.
        //Otherwise, add one and reset the maximum value to a the new maximum value 
        //encountered during DFS

        else if (root.val < min) {
            return 0 + recurseDFS(root.left, min) + recurseDFS(root.right, min);
        }
        else {
            int maximum = min;
            if (root.val > min) {
                maximum = root.val;
            }
            return 1 + recurseDFS(root.left, maximum) + recurseDFS(root.right, maximum);

        }

        
    }
}
