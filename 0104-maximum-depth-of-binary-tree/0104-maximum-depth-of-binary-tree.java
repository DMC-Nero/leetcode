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
class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> elementQueue = new LinkedList<>();
        if(root == null){
            return 0;
        }
        elementQueue.add(root);
        int numberOfLevels = 0;
        
        while(true) {
    // Maintain a count of nodes at each level
            int nodeCountAtLevel = elementQueue.size();
            if(nodeCountAtLevel == 0) {
    // If we find no nodes at level, it means tree has ended, so return
                return numberOfLevels;
            }
            
    // Deque all the nodes present a particular level and add it to queue
            while (nodeCountAtLevel > 0) {
                TreeNode element = elementQueue.poll();
                
                if(element.left != null)
                    elementQueue.add(element.left);
                if(element.right != null)
                    elementQueue.add(element.right);
                nodeCountAtLevel--;
            }
            numberOfLevels++;
        }
    }
}