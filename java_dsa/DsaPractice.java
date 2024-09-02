package java_dsa;

class Avl {

	Node root;

	private class Node {
		int data;
		Node left, right;
		int height;

		Node(int val) {
			this.data = val;
			this.right = null;
			this.left = null;
			this.height = 0;
		}
	}

	Avl() {
		this.root = null;
	}

	Avl(int val) {
		this.root = new Node(val);
	}

	int getHeight(Node root) {
		if (root == null) {
			return -1;
		}
		return root.height;
	}

	int max(int a, int b) {
		return a > b ? a : b;
	}

	int getBalanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	Node insertNode(Node root, int val) {
		if (root == null) {
			return new Node(val);
		}

		if (val < root.data) {
			root.left = insertNode(root.left, val);
		} else if (val > root.data) {
			root.right = insertNode(root.right, val);
		} else {
			return root;
		}

		root.height = 1 + max(getHeight(root.left), getHeight(root.right));

		int balanceFactor = getBalanceFactor(root);

		// LL Rotation
		if (balanceFactor > 1 && val < root.left.data) {
			return rightRotate(root);
		}

		// LR Rotation
		if (balanceFactor > 1 && val > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// RR Rotation
		if (balanceFactor < -1 && val > root.right.data) {
			return leftRotate(root);
		}

		// RL Rotation
		if (balanceFactor < -1 && val < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	Node rightRotate(Node z) {
		Node y = z.left;
		Node t3 = y.right;

		y.right = z;
		z.left = t3;

		z.height = 1 + max(getHeight(z.left), getHeight(z.right));
		y.height = 1 + max(getHeight(y.left), getHeight(y.right));

		return y;
	}

	Node leftRotate(Node z) {
		Node y = z.right;
		Node t3 = y.left;

		y.left = z;
		z.right = t3;

		z.height = 1 + max(getHeight(z.left), getHeight(z.right));
		y.height = 1 + max(getHeight(y.left), getHeight(y.right));

		return y;
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

		root.height = 1 + max(getHeight(root.left), getHeight(root.right));

		int balanceFactor = getBalanceFactor(root);

		// LL Rotation
		if (balanceFactor > 1 && getBalanceFactor(root.left) >= 0) {
			return rightRotate(root);
		}

		// LR Rotation
		if (balanceFactor > 1 && getBalanceFactor(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		// RR Rotation
		if (balanceFactor < -1 && getBalanceFactor(root.right) <= 0) {
			return leftRotate(root);
		}

		// RL Rotation
		if (balanceFactor < -1 && getBalanceFactor(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	int min(Node root) {
		int minVal = root.data;
		while (root.left != null) {
			minVal = root.left.data;
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

	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
}

public class DsaPractice {

	public static void main(String[] args) {
		Avl avltree = new Avl(50);
		avltree.root = avltree.insertNode(avltree.root, 20);
		avltree.root = avltree.insertNode(avltree.root, 60);
		avltree.root = avltree.insertNode(avltree.root, 10);
		avltree.root = avltree.insertNode(avltree.root, 30);
		avltree.root = avltree.insertNode(avltree.root, 40);

		avltree.inOrder(avltree.root);
	}
}
