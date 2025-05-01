/*class Node
{
	char key;
	Node left;
	Node right;

	public Node(char item) 
	{
		key=item;
		left=null;
		right=null;
	}
}

class tree
{
	Node root;

	public void preorderTraversal(Node node)
	{
		if (node!=null)
		{
			System.out.print(node.key+" ");
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}

	// Traverse tree
	public void inorderTraversal(Node node)
	{
		if (node!=null)
		{
			inorderTraversal(node.left);
			System.out.print(node.key+" ");
			inorderTraversal(node.right);
		}
	}

	public void postorderTraversal(Node node)
	{
		if (node!=null)
		{
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.key+" ");
		}
	}
	
	public static void main(String[] args)
	{
		// create an object of BinaryTree
		tree tree = new tree();

		// create nodes of the tree
		tree.root = new Node('1');
		tree.root.left = new Node('2');
		tree.root.right = new Node('3');
		tree.root.left.left = new Node('4');
		tree.root.left.right = new Node('5');

		System.out.println("Preorder traversal: ");
		tree.preorderTraversal(tree.root);
		System.out.println();
		System.out.println("Inorder traversal: ");
		tree.inorderTraversal(tree.root);
		System.out.println();
		System.out.println("Postorder traversal: ");
		tree.postorderTraversal(tree.root);
	}
}*/


/*import java.util.*;
class treeNode {
    int data;
    treeNode left, right;

    public treeNode(int value) {
        data = value;
        left = right = null;
    }
}
public class tree{
    public static void inOrder(treeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void preOrder(treeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(treeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static treeNode insert(treeNode root, int value) {
        if (root == null) {
            return new treeNode(value);
        }
        Queue<treeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            treeNode current = queue.poll();
            if (current.left == null) {
                current.left = new treeNode(value);
                break;
            } else {
                queue.add(current.left);
            }
            if (current.right == null) {
                current.right = new treeNode(value);
                break;
            } else {
                queue.add(current.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        int[] arr = {80, 60, 90, 10, 70, 85, 110};
        treeNode root = null;
        for (int val : arr) {
            root = insert(root, val);
        }
        System.out.println("In-order Traversal:");
        inOrder(root);
        System.out.println("\nPre-order Traversal:");
        preOrder(root);
        System.out.println("\nPost-order Traversal:");
        postOrder(root); 
    }
}*/




import java.util.*;
class Node{
    int key;
    Node left, right;

    public Node(int item){
        key=item;
        left=null;
        right=null;
    }
}

public class tree{
    static Node root;
    public tree(){
        root=null;
    }
    public Node insert(Node root, int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key)root.left=insert(root.left, key);
        else if(key>root.key)root.right=insert(root.right, key);

        return root;
    }
    public int findMin(Node root){
        if(root==null)throw new IllegalStateException("The tree is empty!");
        if(root.left==null)return root.key;

        return findMin(root.left);
    }
    public int findMax(Node root){
        if(root==null)throw new IllegalStateException("The tree is empty!");
        if(root.right==null)return root.key;

        return findMax(root.right);
    }
    public int height(Node node){
        if(node==null){
            return -1;
        }else{
            int leftHeight=height(node.left);
            int rightHeight=height(node.right);

            return Math.max(leftHeight, rightHeight)+1;
        }
    }
    public int countLeafNodes(Node node){
        if(node==null){
            return 0;
        }
        if(node.left==null &&node.right==null){
            return 1;
        }
        else{
            return countLeafNodes(node.left)+countLeafNodes(node.right);
        }
    }
    public void printLeafNodes(Node node){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            System.out.print(node.key+" ");
            return;
        }
        if(node.left!=null){
            printLeafNodes(node.left);
        }
        if(node.right!=null){
            printLeafNodes(node.right);
        }
    }

    public static void main(String args[]){
        tree t=new tree();
        int arr[]={80,60,90,10,70,85,110};
        int i;
        root=new Node(arr[0]);
        for(i=1;i<arr.length;i++){
            t.insert(root, arr[i]);
        }
        // System.out.println("Minimum value: "+t.findMin(root));
        // System.out.println("Maximum value: "+t.findMax(root));
        //System.out.println("Height of the Tree is: "+t.height(root));
        System.out.println("Number of leaf Nodes are: "+t.countLeafNodes(root));
        System.out.println("Leaf Nodes are: ");
        t.printLeafNodes(root);
    }
}