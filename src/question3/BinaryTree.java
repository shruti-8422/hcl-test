package question3;

public class BinaryTree {
	Node root;

	BinaryTree() {
		root = null;
	}

	void traverseLeaves() {
		System.out.print(root.key + " ");
		traverseLeaves(root);
	}

	void traverseLeaves(Node node) {
		if (node == null) {
			return;
		}
		if (node.left != null && node.right != null) {
			System.out.print(node.left.key + " ");
			System.out.print(node.right.key + " ");

		} else if (node.left == null && node.right != null) {
			System.out.print(node.right.key + " ");

		} else if (node.left != null && node.right == null) {
			System.out.print(node.left.key + " ");

		}

		// System.out.print(node.key+" ");
		traverseLeaves(node.left);
		traverseLeaves(node.right);

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
