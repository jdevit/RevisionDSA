package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Perfect program start");

        //Create a binary tree
        BinaryTree btree = new BinaryTree();
        btree.add(5);
        btree.add(3);
        btree.add(2);
        btree.add(9);

        int x = btree.root.value;
        int y = btree.root.left.value;
        System.out.println(x);
        System.out.println(y);






    }
}
