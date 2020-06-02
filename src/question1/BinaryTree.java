package question1;

public class BinaryTree {
	Node root;
	String leaves = "";

	BinaryTree() {
		root = null;
	}

	String traverseLeaves() {
		return traverseLeaves(root);
	}

	String traverseLeaves(Node node) {
		if (node == null) {
			return "";
		}
		if (node.left == null && node.right == null) {
			// System.out.print(node.key+" ");
			leaves += node.key + " ";
			return leaves;

		}
		{
			traverseLeaves(node.right);
			traverseLeaves(node.left);

		}
		return leaves;
	}

	class Node {
		int key;
		Node left, right;

		Node(int key) {
			this.key = key;
			left = right = null;
		}

	}
}
