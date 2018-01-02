
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}   
	
    boolean checkBST(Node root)  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }
 
    /* Returns true if the given tree is a BST and its
      values are >= min and <= max. */
    boolean isBSTUtil(Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null) return true;
 
        if (node.data < min || node.data > max) return false;
 
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }

}
