class TreeNode{

    int data;
    TreeNode left,right;


    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }



}

public class LowestCommonAncestor {
    

    static TreeNode lowestCommonAncestor(TreeNode root, int v1, int v2){

        while (root != null) {
            if (root.data > v1 && root.data > v2) {
                root = root.left;
            } else if (root.data < v1 && root.data < v2) {
                root = root.right;
            } else {
                // Current node is the LCA
                break;
            }
        }
        return root;


    }

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        int v1 = 1;
        int v2 = 7;

        TreeNode lca = lowestCommonAncestor(root, v1, v2);
        System.out.println("Lowest Common Ancestor: " + lca.data);

    }
}
