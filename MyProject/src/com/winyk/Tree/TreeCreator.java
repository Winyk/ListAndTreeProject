package com.winyk.Tree;

public class TreeCreator {
	
	//����һ�ü򵥶�����
	public TreeNode createSampleTree(){
		TreeNode root = new TreeNode('A');
		root.setLeft(new TreeNode('B'));
		root.getLeft().setLeft(new TreeNode('D'));
		root.getLeft().setRight(new TreeNode('E'));
		root.getLeft().getRight().setLeft(new TreeNode('G'));
		root.setRight(new TreeNode('C'));
		root.getRight().setRight(new TreeNode('F'));
		return root ;
	}
	
}
