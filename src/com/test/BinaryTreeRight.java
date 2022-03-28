package com.test;

public class BinaryTreeRight {
	Node root;
	MaxLevel max = new MaxLevel();
	void rightView() {
		rightViewUtil(root, 1, max);
	}
	void rightViewUtil(Node node, int level, MaxLevel max_Level) {
		if(node ==null) {
			return;
		}
		if(max_Level.max_Level < level) {
			System.out.println(node.data);
			max_Level.max_Level = level;
		}
		rightViewUtil(node.right, level +1, max_Level);
		rightViewUtil(node.left, level +1, max_Level);
	}	
	public static void main(String[] args) {
		BinaryTreeRight tree = new BinaryTreeRight();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
         
        tree.rightView();
	}
}

