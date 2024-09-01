package java_dsa;

class BinarySearchTree {

	Node root;

	private class Node {
		int data;
		Node left, right;

		Node(int val) {
			this.data = val;
			this.right = null;
			this.left = null;
		}
	}

	BinarySearchTree() {

	}

	BinarySearchTree(int val) {
		this.root = new Node(val);
	}

	Node insertNode(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}

		if (val < root.data) {
			root.left = insertNode(root.left, val);
		} else {
			root.right = insertNode(root.right, val);
		}

		return root;
	}

	Node delete(Node root, int val) {

		if (root == null) {
			return root;
		}

		if (val < root.data) {
			root.left = delete(root.left, val);
		} else if (val > root.data) {
			root.right = delete(root.right, val);
		} else {
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			root.data = min(root.right);
			root.right = delete(root.right, root.data);

		}

		return root;
	}

	int min(Node root) {
		int minVal = root.data;

		while (root.left != null) {
			minVal = root.data;
			root = root.left;

		}
		return minVal;

	}

	void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
}

public class DsaPractice {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree(50);
		binarySearchTree.insertNode(binarySearchTree.root, 20);
		binarySearchTree.insertNode(binarySearchTree.root, 70);
		binarySearchTree.insertNode(binarySearchTree.root, 10);
		binarySearchTree.insertNode(binarySearchTree.root, 25);
		binarySearchTree.insertNode(binarySearchTree.root, 60);
		binarySearchTree.insertNode(binarySearchTree.root, 90);
		binarySearchTree.insertNode(binarySearchTree.root, 80);
		binarySearchTree.insertNode(binarySearchTree.root, 75);
		binarySearchTree.delete(binarySearchTree.root, 70);
		binarySearchTree.preOrder(binarySearchTree.root);
	}

}
