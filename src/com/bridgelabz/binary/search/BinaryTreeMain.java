package com.bridgelabz.binary.search;

public class BinaryTreeMain {

	public static void main(String[] args) {
			MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
			binaryTree.add(56);

			binaryTree.add(30);
			binaryTree.add(70);
			
			binaryTree.add(22);
			binaryTree.add(40);
			binaryTree.add(60);
			
			binaryTree.add(95);
			binaryTree.add(11);
			binaryTree.add(65);
			
			binaryTree.add(3);
			binaryTree.add(16);
			binaryTree.add(63);
			
			binaryTree.add(67);
			binaryTree.inOrder();
			int size = binaryTree.getSize();

			System.out.print("Size of tree is " + size);
		}
	}