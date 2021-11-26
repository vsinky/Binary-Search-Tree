package com.bridgelabz.binary.search;

public class BinaryTreeMain {

	public static void main(String[] args) {
	
	
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
        binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
	
		System.out.print("Size of tree is " + size);
	}
}

