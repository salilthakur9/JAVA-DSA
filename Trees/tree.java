class Node
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
}