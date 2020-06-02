package question3;

public class BinaryTreeTest {
	public static void main(String[] arg1) {
		BinaryTree tree = new BinaryTree();
		tree.root = tree.new Node(1);
		tree.root.right = tree.new Node(2);
		tree.root.right.right = tree.new Node(5);
		tree.root.right.right.left = tree.new Node(3);
		tree.root.right.right.right = tree.new Node(6);
		tree.root.right.right.left.right = tree.new Node(4);

		tree.traverseLeaves();

	}

}
