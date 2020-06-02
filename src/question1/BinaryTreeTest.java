package question1;

public class BinaryTreeTest {
	public static void main(String[] arg1) {
		BinaryTree tree = new BinaryTree();
		tree.root = tree.new Node(8);
		tree.root.right = tree.new Node(10);
		tree.root.left = tree.new Node(3);
		tree.root.right.right = tree.new Node(14);
		tree.root.right.right.left = tree.new Node(13);
		tree.root.left.left = tree.new Node(1);
		tree.root.left.right = tree.new Node(6);
		tree.root.left.right.right = tree.new Node(7);
		tree.root.left.right.left = tree.new Node(4);

		System.out.print(tree.traverseLeaves());

	}

}
