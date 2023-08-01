/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearchtree;

/**
 *
 * @author levan
 */
public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);
        myBST.insert(27);
        
        System.out.println(myBST.root.right.right.value);
        System.out.println(myBST.contains(22));

    }
}
