package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinaryTree {
    BinaryTreeNode root;



    private BinaryTreeNode addRecursive(BinaryTreeNode current, int value){
        //If the current node does not exist (reached a leaf node)
        //Then create a new node
        if(current == null){
            return new BinaryTreeNode(value);
        }

        //If value is less than current node value
        if(value < current.value){
            //Add child node to left
            current.setLeft(addRecursive(current.left, value));
        } //If value larger than current node value
        else if(value > current.value){
            //Add child node to right
            current.setRight(addRecursive(current.right, value));
        }
        else{
            //Value already exists
            return current;
        }
        return current;
    }

    private boolean containsNodeRecursive(BinaryTreeNode current, int value){
        //If node contains value
            //Return true
        //If current node is leaf node
            //Return false
        return true;
    }


    public void add(int value){
        root = addRecursive(root, value);
    }

    //Breadth-first search
    public ArrayList<Integer> outputBFS(){
        ArrayList<Integer> arr = new ArrayList();
        ArrayList<BinaryTreeNode> toVisit = new ArrayList();
        ArrayList<BinaryTreeNode> visited = new ArrayList();

        BinaryTreeNode current = root;
        if(current.hasLeft()){
            toVisit.add(current.getLeft());
        }
        if(current.hasRight()){
            toVisit.add(current.getRight());
        }


        return arr;
    }

    //Depth-first search
    public ArrayList<Integer> outputDFS(){
        ArrayList<Integer> arr = new ArrayList();
        return arr;
    }

}
