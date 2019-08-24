package com.company;

public class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    //Child
    BinaryTreeNode(int value){
        this.value = value;
        right = null;
        left = null;
    }

    public void setLeft(BinaryTreeNode left){
        this.left = left;
    }

    public void setRight(BinaryTreeNode right){
        this.right = right;
    }

    public BinaryTreeNode getLeft(){
        return this.left;
    }

    public BinaryTreeNode getRight(){
        return this.right;
    }

    public boolean hasLeft(){
        if(this.left==null){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean hasRight(){
        if(this.right==null){
            return false;
        }
        else{
            return true;
        }
    }




}
