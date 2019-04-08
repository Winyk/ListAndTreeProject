package com.winyk.Tree;

public class TreeTraversal {

	//ǰ�����
	public void preOrder(TreeNode root){
		if(root == null){
			return ;
		}
		System.out.print(root.getValue()+" ");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	
	//�������
	public void inOrder(TreeNode root){
		if(root == null){
			return ;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue()+" ");
		inOrder(root.getRight());
	}
	
	//�������
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
