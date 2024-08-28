package practice;

class BinarySearchTree {

	Node root;

	private class Node {
		int data;
		Node left, right;

		Node(int val) {
			this.data = val;
			left = right = null;
		}
	}

	BinarySearchTree() {

	}

	BinarySearchTree(int val) {
		root = new Node(val);
	}

	Node insertNode(Node root, int val) {

		if (root == null) {
			return new Node(val);
		}
		if (val < root.data) {
			root.left = insertNode(root.left, val);
		} else {
			root.right = insertNode(root.right, val);
		}
		return root;

	}

	void preOrderTraversal(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}

	}
}

class Practice {
	public static void main(String[] args) {
		BinarySearchTree binaryTree = new BinarySearchTree(10);

		binaryTree.insertNode(binaryTree.root, 6);
		binaryTree.insertNode(binaryTree.root, 7);

		binaryTree.preOrderTraversal(binaryTree.root);
	}

}
