package com.winyk.Tree;

public class TreeTraversal {

	//前序遍历
	public void preOrder(TreeNode root){
		if(root == null){
			return ;
		}
		System.out.print(root.getValue()+" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	//中序遍历
	public void inOrder(TreeNode root){
		if(root == null){
			return ;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue()+" ");
		inOrder(root.getRight());
	}
	
	//后序遍历
	public void postOrder(TreeNode root){
		if(root == null){
			return ;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.getValue()+" ");
	}
	
	public static void main(String[] args) {
		TreeCreator creator = new TreeCreator();
		TreeTraversal traversal = new TreeTraversal();
		traversal.preOrder(creator.createSampleTree());
		System.out.println();
		traversal.inOrder(creator.createSampleTree());
		System.out.println();
		traversal.postOrder(creator.createSampleTree());
	}

}
